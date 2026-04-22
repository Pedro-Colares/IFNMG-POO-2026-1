package com.gmail.colaresp47.spaceshare;

public class CabineCall extends Estacao {
    
    private boolean isolamentoAcustico;

    public CabineCall(int numero, boolean isolamentoAcustico) {
        super(numero);
        this.isolamentoAcustico = isolamentoAcustico;
    }
    
    public void entrarEmChamada(){
        if(isolamentoAcustico){
            System.out.println("Silencio ativado.\n");
        }
    }
    
}
