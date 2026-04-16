package com.gmail.colaresp47.spaceshare;

import java.util.ArrayList;
import java.time.LocalTime;

public class SpaceShare {

    public static void main(String[] args) {
        
        ArrayList<Estacao> estacoes = new ArrayList<>();
        
        Estacao e1 = new Estacao();
        e1.setNumero(1);
        
        Reserva r1 = new Reserva();
        r1.setHoraInicio(LocalTime.of(8, 0));
        r1.setUsuario("Joao");
        r1.setDuracaoHoras(2);
        
        Reserva r2 = new Reserva();
        r2.setHoraInicio(LocalTime.of(9, 0));
        r2.setUsuario("Maria");
        r2.setDuracaoHoras(2);
        
        Reserva r3 = new Reserva();
        r3.setHoraInicio(LocalTime.of(10, 0));
        r3.setUsuario("Carlos");
        r3.setDuracaoHoras(1);
        
        Reserva r4 = new Reserva();
        r4.setHoraInicio(LocalTime.of(7, 0));
        r4.setUsuario("Ana");
        r4.setDuracaoHoras(4);
        
        e1.adicionarReserva(r1);
        e1.adicionarReserva(r2);
        e1.adicionarReserva(r3);
        e1.adicionarReserva(r4);
             
        estacoes.add(e1);
        
        System.out.println("\n --- Mapa de Estacoes ---");
        for(Estacao e: estacoes){
            e.imprimirMapa();
        }
        System.out.println("-------------------------\n");
        
    }
}
