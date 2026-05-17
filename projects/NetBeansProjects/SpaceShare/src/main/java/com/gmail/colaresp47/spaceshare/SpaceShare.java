package com.gmail.colaresp47.spaceshare;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class SpaceShare {

    public static void main(String[] args) {

        HashMap<Integer, Estacao> estacoes = new HashMap<>();
        ArrayList<Estacao> lista = new ArrayList<>();

        Mesa e1 = new Mesa(501);

        try {
            SalaReuniao e2 = new SalaReuniao(2, 10, true);

            Reserva r2 = new Reserva();

            r2.setUsuario("Maria");
            r2.setHoraInicio(LocalTime.of(8, 0));
            r2.setDuracaoHoras(1);

            e2.adicionarReserva(r2);
            e2.exibirEspecificacoes();
            e2.realizarLimpeza();

            estacoes.put(e2.getNumero(), e2);
            lista.add(e2);

            SalaReuniao e4 = new SalaReuniao(505, 50, true);

        }catch(RuntimeException e) {
            System.out.println("\nErro ao criar sala: " + e.getMessage());
        }

        try{
            SalaReuniao sala = new SalaReuniao(10, 8, true);
            double valor = sala.calcularCustoPorPessoa(100, 0);
            System.out.println("Valor por pessoa: " + valor);
        }catch(ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        CabineCall e3 = new CabineCall(3, true);

        Reserva r1 = new Reserva();
        r1.setUsuario("Joao");
        r1.setHoraInicio(LocalTime.of(14, 0));
        r1.setDuracaoHoras(2);

        Reserva r3 = new Reserva();
        r3.setUsuario("Clara");
        r3.setHoraInicio(LocalTime.of(10, 0));
        r3.setDuracaoHoras(1);

        e1.adicionarReserva(r1);
        e3.adicionarReserva(r3);

        estacoes.put(e1.getNumero(), e1);
        estacoes.put(e3.getNumero(), e3);

        System.out.println("\n=== MAPA DE ESTACOES ===");

        for (Estacao e : estacoes.values()) {
            e.imprimirMapa();
        }

        e3.entrarEmChamada();

        Promocional promo = new CabineCall(505, true);
        promo.aplicarDesconto(10.00);

        System.out.println("\n=== RELATORIO FINANCEIRO ===");

        lista.add(e1);
        lista.add(e3);

        GerenciadorFinanceiro gf = new GerenciadorFinanceiro();

        gf.imprimirFaturamento(lista, 3);

    }
}
