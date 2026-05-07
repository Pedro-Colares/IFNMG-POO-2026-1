package com.gmail.colaresp47.spaceshare;

import java.util.HashMap;
import java.time.LocalTime;

public class SpaceShare {

    public static void main(String[] args) {

        HashMap<Integer, Estacao> estacoes = new HashMap<>();

        Estacao e1 = new Estacao(1);

        SalaReuniao e2 = new SalaReuniao(501, 10, true);

        CabineCall e3 = new CabineCall(10, true);

        Reserva r1 = new Reserva();
        r1.setUsuario("Joao");
        r1.setHoraInicio(LocalTime.of(8, 0));
        r1.setDuracaoHoras(2);

        Reserva r2 = new Reserva();
        r2.setUsuario("Maria");
        r2.setHoraInicio(LocalTime.of(10, 0));
        r2.setDuracaoHoras(1);

        e1.adicionarReserva(r1);
        e1.adicionarReserva(r2);

        estacoes.put(e1.getNumero(), e1);
        estacoes.put(e2.getNumero(), e2);
        estacoes.put(e3.getNumero(), e3);

        System.out.println("\n--- Buscando estacao 1 ---");

        Estacao buscada = Estacao.buscarEstacao(estacoes, 1);

        if (buscada != null) {
            buscada.imprimirMapa();
        } else {
            System.out.println("Estacao nao encontrada.");
        }

        System.out.println("\n--- Buscando estacao 501 ---");

        Estacao buscada2 = Estacao.buscarEstacao(estacoes, 501);

        if (buscada2 != null) {
            buscada2.imprimirMapa();
        } else {
            System.out.println("Estacao nao encontrada.");
        }
        
        System.out.println("\n   === MAPA DE ESTACOES ===");
        for (Estacao e : estacoes.values()) {
            e.imprimirMapa();
            System.out.println();
        }
    }

}