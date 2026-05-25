package com.gmail.colaresp47.e.commerce;

public abstract class FormaPagamento {
    
    protected double valorTotal;
    protected String status;

    public double getValorTotal() {
        return valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public FormaPagamento(double valorTotal) {
        
        this.valorTotal = valorTotal;
        this.status = "PENDENTE";
    }
    
    public abstract void processar();
    
}
