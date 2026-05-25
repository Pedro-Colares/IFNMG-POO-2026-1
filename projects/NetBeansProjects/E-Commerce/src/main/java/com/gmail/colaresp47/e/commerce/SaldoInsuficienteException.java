package com.gmail.colaresp47.e.commerce;

public class SaldoInsuficienteException extends RuntimeException {
    
    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
    
}
