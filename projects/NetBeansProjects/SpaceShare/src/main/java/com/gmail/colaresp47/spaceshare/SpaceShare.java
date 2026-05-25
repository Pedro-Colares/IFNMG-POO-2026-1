package com.gmail.colaresp47.spaceshare;

import java.time.LocalTime;

public class SpaceShare {
    public static void main(String[] args){
        try{
            SalaReuniao sr = new SalaReuniao(100, 50, true);
        }catch (CapacidadeExcedidaException e) {
            System.out.println("Erro de capacidade: " + e.getMessage());
        }catch (ConflitoReservaException e) {
            System.out.println("Erro de reserva: " + e.getMessage());
        }

        try{
            SalaReuniao e2 = new SalaReuniao(10, 18, true);
            Reserva r1 = new Reserva();
            r1.setUsuario("Joao");
            r1.setHoraInicio(LocalTime.of(10, 0));
            r1.setDuracaoHoras(2);

            Reserva r2 = new Reserva();
            r2.setUsuario("Maria");
            r2.setHoraInicio(LocalTime.of(10, 0));
            r2.setDuracaoHoras(1);

            e2.adicionarReserva(r1);
            e2.adicionarReserva(r2);
        }catch(CapacidadeExcedidaException e){
            System.out.println("Erro de capacidade: " + e.getMessage());
        }catch(ConflitoReservaException e){
            System.out.println("Erro de reserva: " + e.getMessage());
        }

    }
}
