package com.gmail.colaresp47.spaceshare;

import java.util.HashMap;
import java.time.LocalTime;

public class SpaceShare {

    public static void main(String[] args) {

        HashMap<Integer, Estacao> estacoes = new HashMap<>();

        Estacao e1 = new Estacao(1);

        Reserva r1 = new Reserva();
        r1.setUsuario("Joao");
        r1.setHoraInicio(LocalTime.of(14, 0));
        r1.setDuracaoHoras(2);

        Reserva r2 = new Reserva();
        r2.setUsuario("Maria");
        r2.setHoraInicio(LocalTime.of(8, 0));
        r2.setDuracaoHoras(1);

        Reserva r3 = new Reserva();
        r3.setUsuario("Clara");
        r3.setHoraInicio(LocalTime.of(10, 0));
        r3.setDuracaoHoras(1);

        e1.adicionarReserva(r1);
        e1.adicionarReserva(r2);
        e1.adicionarReserva(r3);

        estacoes.put(e1.getNumero(), e1);

        System.out.println("\n   === MAPA DE ESTACOES ===");

        Estacao buscada = Estacao.buscarEstacao(estacoes, 1);

        if (buscada != null) {
            buscada.imprimirMapa();
        } else {
            System.out.println("Estacao nao encontrada.");
        }
    }
}