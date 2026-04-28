package com.gmail.colaresp47.spaceshare;

import java.time.LocalTime;
import java.util.Objects;

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

    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null || getClass()!=obj.getClass())return false;
        Reserva other = (Reserva)obj;
        return Objects.equals(usuario, other.usuario) && 
               Objects.equals(horaInicio, other.horaInicio);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(usuario, horaInicio);
    }
   
}
