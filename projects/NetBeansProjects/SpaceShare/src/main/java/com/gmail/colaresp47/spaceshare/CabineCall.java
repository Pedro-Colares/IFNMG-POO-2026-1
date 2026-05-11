package com.gmail.colaresp47.spaceshare;

public class CabineCall extends Estacao implements Promocional{
    
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
    
    @Override
    public double calcularPreco(int horas){
        double valorBase = calcularPrecoBase(horas);
        return (isolamentoAcustico) ? valorBase*1.2 : valorBase;
    }
    
    @Override
    public void aplicarDesconto(double desconto){
        System.out.println("Deconto de R$ " + desconto + " aplicado.");
    } 
    
}
