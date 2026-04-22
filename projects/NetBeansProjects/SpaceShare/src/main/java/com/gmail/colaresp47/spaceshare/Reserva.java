package com.gmail.colaresp47.spaceshare;

import java.time.LocalTime;

public class Reserva {
    
    private String usuario;
    private LocalTime horaInicio;
    private int duracaoHoras;

    public Reserva() {
        
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }
    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public LocalTime getHoraTermino() {
        return horaInicio.plusHours(duracaoHoras);
    }

    
   
}
