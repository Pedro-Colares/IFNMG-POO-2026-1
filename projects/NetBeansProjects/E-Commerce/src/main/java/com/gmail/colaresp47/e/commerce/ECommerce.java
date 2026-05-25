/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.gmail.colaresp47.e.commerce;

/**
 *
 * @author liaco
 */
import java.util.ArrayList;

public class ECommerce {

    public static void main(String[] args) {

        ArrayList<FormaPagamento> carrinho = new ArrayList<>();

        PagamentoCartao c1 = new PagamentoCartao("1234 1981 2019 2025", 5, 1500);
        PagamentoCartao c2 = new PagamentoCartao("4444 3258 9876 7890 ", 3, 900);

        PagamentoPix p1 = new PagamentoPix("38911111111", 3500);
        PagamentoPix p2 = new PagamentoPix("", 2125);

        carrinho.add(c1);
        carrinho.add(c2);
        carrinho.add(p1);
        carrinho.add(p2);

        for (FormaPagamento p : carrinho) {

            try {
                p.processar();
                System.out.println("Pagamento processado! Status: " + p.getStatus());
                if (p instanceof EmitenteNotaFiscal) {
                    ((EmitenteNotaFiscal) p).emitirNFe();
                }
            } catch (SaldoInsuficienteException e) {
                System.out.println("Operacao Recusada: " + e.getMessage());
            } catch (ChavePixInvalidaException e) {
                System.out.println("Falha no Pix: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de Valor: " + e.getMessage());
            }
            System.out.println("-----------------------------------------");
        }
    }

}

