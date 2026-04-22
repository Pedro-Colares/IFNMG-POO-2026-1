package com.gmail.colaresp47.spaceshare;

public class SalaReuniao extends Estacao {
    
    private int capacidade;
    private boolean temProjetor;

    public SalaReuniao(int numero, int capacidade, boolean temProjetor) {
        super(numero);
        this.capacidade = capacidade;
        this.temProjetor = temProjetor;
    }
    
    public void exibirEspecificacoes(){
        System.out.println("Especificacoes da sala " + getNumero() + ": ");
        System.out.println("Capacidade: " + capacidade + " pessoas");
        System.out.println("Recursos: " + (temProjetor ? "projetor disponivel.\n" : 
                "apenas mesa.\n"));
    }
    
}
