package com.gmail.colaresp47.leitura;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura {

    public static void main(String[] args) {
        
        try(BufferedReader leitor = new BufferedReader
        (new FileReader("../Escrita/meus_jogos.csv"))){
            String linha;
            while((linha = leitor.readLine()) != null){
                String[] pedacos = linha.split(";");
                String nome = pedacos[0];
                String plataforma = pedacos[1];
                int ano = Integer.parseInt(pedacos[2]);
                System.out.println("Jogo: " + nome + " Lancado em " + ano + 
                        " para a plataforma " + plataforma);
            }
        }catch(IOException e){
            System.out.println("Erro de leitura: " + e.getMessage());
        }
        
    }
}
