package com.gmail.colaresp47.ecodrive1;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;

public class EcoDrive1 {

    public static void main(String[] args) {

        HashSet<Veiculo> veiculos = new HashSet<>();

        Veiculo v1 = new Veiculo();
        v1.setPlaca("IFN-2026");
        v1.setModelo("Azul");

        Veiculo v2 = new Veiculo();
        v2.setPlaca("IFN-2026");
        v2.setModelo("Preto");

        System.out.println(veiculos.add(v1));
        System.out.println(veiculos.add(v2));

        System.out.println("Total de veiculos: " + veiculos.size());
    }
}
