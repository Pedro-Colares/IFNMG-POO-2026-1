package com.gmail.colaresp47.spaceshare;

public class SalaReuniao extends Estacao implements Higienizavel{
    
    private int capacidade;
    private boolean temProjetor;

    public SalaReuniao(int numero, int capacidade, boolean temProjetor) {
        super(numero);
        
        if(capacidade < 2 || capacidade > 20){
            throw new RuntimeException("Capacidade invalida");
        }
        this.capacidade = capacidade;
        this.temProjetor = temProjetor;
    }
    
    public void exibirEspecificacoes(){
        System.out.println("Especificacoes da sala " + getNumero() + ": ");
        System.out.println("Capacidade: " + capacidade + " pessoas");
        System.out.println("Recursos: " + (temProjetor ? "projetor disponivel.\n" : 
                "apenas mesa.\n"));
    }
    
    @Override 
    public double calcularPreco(int horas) { 
        double valorBase = calcularPrecoBase(horas); 
        return (temProjetor) ? valorBase + 50.0 : valorBase; 
    }
    
    @Override
    public void realizarLimpeza() {
        System.out.println("Limpando sala, trocando cafe e higienizando "
                + "projetor.");
    }
    
    public double calcularCustoPorPessoa(double total, int pessoas){
        if(pessoas==0){
            throw new ArithmeticException("Numero de pessoas invalido.\n");
        }
        
        return total/pessoas;
    }
    
}
