/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmail.colaresp47.e.commerce;

/**
 *
 * @author liaco
 */
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
