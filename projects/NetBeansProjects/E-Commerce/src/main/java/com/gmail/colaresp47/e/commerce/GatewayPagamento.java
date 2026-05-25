/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gmail.colaresp47.e.commerce;

/**
 *
 * @author liaco
 */
public class GatewayPagamento implements AutoCloseable {
    
    public void conectar(){
        System.out.println("Conectando ao servidor de cartoes...");
    }
    
    @Override
    public void close(){
        System.out.println("Conexao com o gatway encerrada com seguranca.");
    }
    
}
