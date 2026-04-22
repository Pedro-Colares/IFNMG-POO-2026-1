package com.gmail.colaresp47.spaceshare;

import java.util.ArrayList;
import java.time.LocalTime;

public class SpaceShare {

    public static void main(String[] args) {
        
        ArrayList<Estacao> estacoes = new ArrayList<>();
        
        Estacao e1 = new Estacao(1);
        
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
        
        SalaReuniao e2 = new SalaReuniao(501, 10, true);
        CabineCall e3 = new CabineCall(10, true);
        
        Reserva r5 = new Reserva();
        r5.setHoraInicio(LocalTime.of(7, 0));
        r5.setUsuario("Raiane");
        r5.setDuracaoHoras(3);
        
        Reserva r6 = new Reserva();
        r6.setHoraInicio(LocalTime.of(8, 30));
        r6.setUsuario("Clara");
        r6.setDuracaoHoras(4);
        
        e2.adicionarReserva(r5);
        e2.exibirEspecificacoes();
        
        e3.adicionarReserva(r6);
        e3.entrarEmChamada();
      
        estacoes.add(e1);
        estacoes.add(e2);
        estacoes.add(e3);
        
        System.out.println("\n --- Mapa de Estacoes ---");
        for(Estacao e: estacoes){
            e.imprimirMapa();
            System.out.println("\n");
        }
        System.out.println("-------------------------\n");
        
    }
}
