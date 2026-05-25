/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmail.colaresp47.e.commerce;

/**
 *
 * @author liaco
 */
public class PagamentoCartao extends FormaPagamento implements EmitenteNotaFiscal {
    
    private String numeroCartao;
    private int parcelas;

    public PagamentoCartao(String numeroCartao, int parcelas, double valor) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }
    
    public String Primeiros4(){
        return this.numeroCartao.substring(0, 4);
    }
    
    @Override
    public void processar(){
        
        try(GatewayPagamento gtp = new GatewayPagamento()){
            
            gtp.conectar();
            String four = Primeiros4();
            if(four.equals("4444")){
                throw new SaldoInsuficienteException("Saldo insuficiente");
            }
        
            status = "APROVADO";
            System.out.println("Pagamento aprovado com sucesso!\n");
        }
        
    }
    
    public String Mascarador(){
        String forma = this.numeroCartao.replaceAll("\\s+", "");
        String finais = forma.substring(forma.length() - 4);
        return "**** **** **** " + finais;
    }
    
    @Override
    public void emitirNFe(){
        
        String cartaoMascarado = Mascarador();
        System.out.println("Cartao: " + cartaoMascarado);
        System.out.printf("Imposto: R$ %.2f", valorTotal * 0.15);
        System.out.println("\n");
    }
    
}
