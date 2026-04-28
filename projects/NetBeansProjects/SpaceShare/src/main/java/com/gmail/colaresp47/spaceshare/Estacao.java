package com.gmail.colaresp47.spaceshare;

import java.util.HashSet;

public class Estacao {
    
    protected int numero;
    private HashSet<Reserva> listaReservas;
    
    public Estacao(int numero) {
        this.numero = numero;
        this.listaReservas = new HashSet<>();
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public HashSet<Reserva> getListaReservas(){
        return listaReservas;
    }
    public void setListaReserva(HashSet<Reserva> listaReservas){
        this.listaReservas = listaReservas;
    }
    
    public boolean adicionarReserva(Reserva nova){
        if(listaReservas.add(nova)){
            System.out.println("Reserva cadastrada com sucesso!\n");
            return true;
        }
        
        System.out.println("Reserva ignorada: este agendamento ja existe.");
                return false;
    }
    
    public void imprimirMapa(){
        System.out.println("Estacao " + this.numero + ": ");
        for(Reserva j: listaReservas){
            System.out.println(j.getUsuario() + ": " + j.getHoraInicio() + " - " + j.getHoraTermino());
        }
    }
    
}
