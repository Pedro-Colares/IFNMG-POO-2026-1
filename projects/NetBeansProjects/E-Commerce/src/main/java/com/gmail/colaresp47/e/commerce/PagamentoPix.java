package com.gmail.colaresp47.e.commerce;

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
