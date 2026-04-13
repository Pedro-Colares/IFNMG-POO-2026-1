package com.gmail.colaresp47.ecodrive1;

import java.time.LocalDate;
import java.time.Month;

public class EcoDrive1 {

    public static void main(String[] args) {
        
        Motorista m1 = new Motorista();
        m1.setNome("Pedro");
        m1.setCnh(123456789);
        m1.setCategoria('D');
        
        Veiculo v1 = new Veiculo();
        v1.setModelo("Scania");
        v1.setPlaca("POO1S26");
        v1.setNivelCombustivel(50);
        
        v1.setMotorista(m1);
        System.out.println(m1);
        System.out.println(v1);
        
        Viagem t1 = new Viagem(LocalDate.of(2026, Month.APRIL, 5), 20);
        Viagem t2 = new Viagem(LocalDate.of(2026, Month.APRIL, 13), 50);
        Viagem t3 = new Viagem(LocalDate.of(2026, Month.APRIL, 20), 15);
        
        v1.registrarViagens(t1);
        v1.registrarViagens(t2);
        v1.registrarViagens(t3);
        
        v1.gerarRelatorioViagem();
        System.out.println(v1);
        
        Viagem t4 = new Viagem(LocalDate.of(2026, Month.APRIL, 28), 500);
        v1.registrarViagens(t4);
        v1.gerarRelatorioViagem();
        
        Motorista m2 = new Motorista();
        m2.setNome("Joao");
        m2.setCnh(987654321);
        m2.setCategoria('A');
        
        Veiculo v2 = new Veiculo();
        v2.setModelo("Truck");
        v2.setNivelCombustivel(50);
        v2.setPlaca("TON2V13");
        
        v2.setMotorista(m2);
        System.out.println(m2 + "\n" + v2);
        
        Motorista m3 = new Motorista();
        m3.setNome("Ricardo");
        m3.setCategoria('D');
        m3.setCnh(235711317);
        
        Viagem t5 = new Viagem(LocalDate.of(2026, Month.APRIL, 20), 150);
        v2.registrarViagens(t5);
        v2.setMotorista(m3);
        System.out.println(m3);
        v2.registrarViagens(t5);
        v2.gerarRelatorioViagem();
        System.out.println(v2);
        
    }
}
