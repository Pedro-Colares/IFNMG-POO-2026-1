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
    
    public boolean adicionarReserva(Reserva nova){
        for(Reserva i: this.listaReservas){
            boolean conflito = nova.getHoraInicio().isBefore(i.getHoraTermino()) &&
                   nova.getHoraTermino().isAfter(i.getHoraInicio());
            if(conflito){
                System.out.println("Devido ao conflito de horario com " 
                        + i.getUsuario() + " de "+ i.getHoraInicio()  
                        + " as " + i.getHoraTermino() + ", infelizmente "
                        + "a reserva nao foi cadastarda.");
                return false;
            }
        }
        System.out.println("Reserva de " + nova.getUsuario()+ " as " + 
                nova.getHoraInicio() + ", por " + nova.getDuracaoHoras() + ""
                        + "h cadastrada com sucesso!");
        this.listaReservas.add(nova);
        return true;
    }
    
    public void imprimirMapa(){
        System.out.println("Estacao " + this.numero + ": ");
        for(Reserva j: listaReservas){
            System.out.println(j.getUsuario() + ": " + j.getHoraInicio() + " - " + j.getHoraTermino());
        }
        
    }
    
}
