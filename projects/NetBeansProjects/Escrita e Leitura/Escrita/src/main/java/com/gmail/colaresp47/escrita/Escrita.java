package com.gmail.colaresp47.escrita;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Escrita {

    public static void main(String[] args) {
        
        try(PrintWriter caneta = new PrintWriter(new FileWriter("meus_jogos.csv"))){
            caneta.println("DLS;Mobile;2015");
            caneta.println("Minecraft 3;PC;2011");
            caneta.println("SimCityBuildlt;Mobile;2014");
        }catch(IOException e){
            System.out.println("Ops, aconteceu um erro de Entrada/Saida: "
                    + e.getMessage());
        }
        
    }
}

