package com.gmail.colaresp47.e.commerce;

public class GatewayPagamento implements AutoCloseable {
    
    public void conectar(){
        System.out.println("Conectando ao servidor de cartoes...");
    }
    
    @Override
    public void close(){
        System.out.println("Conexao com o gatway encerrada com seguranca.");
    }
    
}
