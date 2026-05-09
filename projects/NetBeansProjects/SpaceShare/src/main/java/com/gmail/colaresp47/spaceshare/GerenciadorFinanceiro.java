package com.gmail.colaresp47.spaceshare;

import java.util.ArrayList;

public class GerenciadorFinanceiro {
    
    public void imprimirFaturamento(ArrayList<Estacao> lista, int horas) { 
     for (Estacao e : lista) {
 
           System.out.println("Estacao " + e.getNumero() + " | Total: R$ " + 
                   e.calcularPreco(horas)); 
     }
 }
    
}
