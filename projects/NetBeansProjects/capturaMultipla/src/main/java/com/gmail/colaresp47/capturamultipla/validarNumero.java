package com.gmail.colaresp47.capturamultipla;

public class validarNumero {
    
    public static int validar(String s){
        int numero = Integer.parseInt(s);
        
        if(numero<0){
            throw new  IllegalArgumentException("Numero negativo invalido.\n");
        }
        
        return numero;
    }
    
}
