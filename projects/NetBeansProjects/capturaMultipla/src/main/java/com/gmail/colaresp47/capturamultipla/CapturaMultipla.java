package com.gmail.colaresp47.capturamultipla;

public class CapturaMultipla {

    public static void main(String[] args) {

        try{
            int numero = validarNumero.validar("25");
            System.out.println("Numero valido: " + numero);
        }catch(NumberFormatException e){
            System.out.println("Erro de conversao: " + e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }

        try{
            int numero = validarNumero.validar("-10");
            System.out.println("Numero valido: " + numero);
        }catch(NumberFormatException e){
            System.out.println("Erro de conversao: " + e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }

        try{
            int numero = validarNumero.validar("abc");
            System.out.println("Numero valido: " + numero);
        }catch(NumberFormatException e){
            System.out.println("Erro de conversao: " + e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}