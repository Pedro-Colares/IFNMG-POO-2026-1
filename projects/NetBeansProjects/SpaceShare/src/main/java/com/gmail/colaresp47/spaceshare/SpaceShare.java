package com.gmail.colaresp47.spaceshare;

import java.util.ArrayList;

public class SpaceShare {

    public static void main(String[] args) {
        
        ArrayList<Estacao> estacoes = new ArrayList<>();
        
        Estacao e1 = new Estacao();
        e1.setNumero(1);
        
        Reserva r1 = new Reserva();
        r1.setHoras(2);
        r1.setUsuario("Maria");
        
        Reserva r2 = new Reserva();
        r2.setHoras(3);
        r2.setUsuario("Adriano");
        
        Reserva r3 = new Reserva();
        r3.setHoras(4);
        r3.setUsuario("Ana Claudia");
        
        Reserva r4 = new Reserva();
        r4.setHoras(1);
        r4.setUsuario("Paulo");
        
        Reserva r5 = new Reserva();
        r5.setHoras(3);
        r5.setUsuario("Thiago");
        
        e1.adicionarReserva(r1);
        e1.adicionarReserva(r2);
        e1.adicionarReserva(r3);
        e1.adicionarReserva(r4);
        e1.adicionarReserva(r5);
        
        Estacao e2 = new Estacao();
        e2.setNumero(2);
        e2.adicionarReserva(r5);
        
        estacoes.add(e1);
        estacoes.add(e2);
        
        System.out.println("\n --- Mapa de Estacoes ---");
        for(Estacao e: estacoes){
            e.imprimirMapa();
        }
        System.out.println("-------------------------\n");
        
    }
}
