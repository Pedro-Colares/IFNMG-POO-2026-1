package com.gmail.colaresp47.spaceshare;

public class Mesa extends Estacao {
    
    public Mesa(int numero){
        super(numero);
    }
    
    @Override
    public double calcularPreco(int horas){
        double valorBase = horas*10;
        return valorBase;
    }
    
}
