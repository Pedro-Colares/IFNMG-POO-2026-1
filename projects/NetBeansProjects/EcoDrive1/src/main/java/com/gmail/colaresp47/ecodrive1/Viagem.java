package com.gmail.colaresp47.ecodrive1;

import java.time.LocalDate;

public class Viagem {

    public Viagem(LocalDate data, double distancia) {
        this.data = data;
        this.distancia = distancia;
    }
    
    
    
    private LocalDate data;
    private double distancia;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    
}
