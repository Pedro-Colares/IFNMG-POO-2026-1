package com.gmail.colaresp47.spaceshare;

import java.util.HashSet;
import java.util.HashMap;

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
    
    public static Estacao buscarEstacao(HashMap<Integer, Estacao> mapa, int numero) {
        return mapa.get(numero);
    }
    
    public void imprimirMapa(){
        System.out.println("\nEstacao " + this.numero + ": ");
        for(Reserva j: listaReservas){
            System.out.println(j.getUsuario() + ": " + j.getHoraInicio() + " - " + j.getHoraTermino());
        }
    }
    
}
