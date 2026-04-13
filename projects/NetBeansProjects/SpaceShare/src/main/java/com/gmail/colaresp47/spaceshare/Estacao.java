package com.gmail.colaresp47.spaceshare;

import java.util.ArrayList;

public class Estacao {
    
    private int numero;
    private ArrayList<Reserva> listaReservas;
    
    public Estacao() {
        this.listaReservas = new ArrayList<>();
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public ArrayList<Reserva> getListaReservas(){
        return listaReservas;
    }
    public void setListaReserva(ArrayList<Reserva> listaReservas){
        this.listaReservas = listaReservas;
    }
    
    public boolean adicionarReserva(Reserva r){
        int horas = 0;
        
        for(Reserva i: this.listaReservas){
            horas += i.getHoras();
        }
        if((horas + r.getHoras()) <= 10){
            this.listaReservas.add(r);
            System.out.println("Reserva do usuario " + r.getUsuario() + " com " 
                    + r.getHoras()+ "h de duracao cadastrada com sucesso.");
            return true;
        }
        
        System.out.println("Devido ao limite de horas da estacao, infelizmente "
                + "a reserva nao foi cadastrada.");
        return false;
    }
    
    public void imprimirMapa(){
        System.out.println("Estacao: " + this.numero);
        for(Reserva j: listaReservas){
            System.out.println(j.getUsuario());
        }
        
    }
    
}
