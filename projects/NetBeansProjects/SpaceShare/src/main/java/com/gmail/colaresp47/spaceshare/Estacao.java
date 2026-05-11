package com.gmail.colaresp47.spaceshare;

import java.util.TreeSet;
import java.util.HashMap;

public abstract class Estacao {
    
    protected int numero;
    private TreeSet<Reserva> listaReservas;
    
    public Estacao(int numero) {
        this.numero = numero;
        this.listaReservas = new TreeSet<>();
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public TreeSet<Reserva> getListaReservas(){
        return listaReservas;
    }
    public void setListaReserva(TreeSet<Reserva> listaReservas){
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
    
    protected double calcularPrecoBase(int horas){
        return horas*20;
    }
    
    abstract double calcularPreco(int horas); 
    
}
