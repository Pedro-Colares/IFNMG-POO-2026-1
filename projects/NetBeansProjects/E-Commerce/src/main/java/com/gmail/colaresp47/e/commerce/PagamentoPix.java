/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmail.colaresp47.e.commerce;

/**
 *
 * @author liaco
 */
public class PagamentoPix extends FormaPagamento {
    
    private String chavePix;

    public PagamentoPix(String chavePix, double valor) {
        super(valor);
        this.chavePix = chavePix;
    }
    
    @Override
    public void processar(){
        if(this.chavePix.equals(null) || this.chavePix.equals("")){
            throw new ChavePixInvalidaException("Chave pix invalida");
        }
        
        status = "APROVADO";
    }
    
}
