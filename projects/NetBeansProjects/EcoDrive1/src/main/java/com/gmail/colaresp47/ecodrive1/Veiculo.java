package com.gmail.colaresp47.ecodrive1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Veiculo {

    public Veiculo(ArrayList<Viagem> viagens) {
        this.historicoViagens = viagens;
    }
    public Veiculo() {
        this.historicoViagens = new ArrayList<>();
    }
    
    private String placa;
    private String modelo;
    private double nivelCombustivel;
    final double CAPACIDADE_MAX = 50;
    private double distanciaTotalPercorrida = 0;
    private Motorista motorista;
    private ArrayList<Viagem> historicoViagens;
    
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public double getNivelCombustivel(){
        return nivelCombustivel;
    }
    public void setNivelCombustivel(double nivelCombustivel){
        this.nivelCombustivel = nivelCombustivel;
    }
    
    public double getDistanciaTotalPercorrida(){
        return distanciaTotalPercorrida;
    }

    public Motorista getMotorista(){
        return motorista;
    }

    public void setMotorista(Motorista motorista){
        if(motorista!=null && !(motorista.getCategoria()=='D')){
            System.out.println("Erro: motorista precisa ter CNH categoria D.");
            return;
        }
        if(this.motorista != null){
            this.motorista.setVeiculo(null);
        }
        this.motorista = motorista;
        if(motorista != null){
            this.motorista.setVeiculo(this);
        }
    }
    
    public ArrayList<Viagem> getViagens(){
        return historicoViagens;
    }
    
    public void setViagens(ArrayList<Viagem> viagens){
        this.historicoViagens = viagens;
    }
    
    public boolean registrarViagens(Viagem viagem){
        if(this.motorista==null){
            System.out.println("Erro: nao e possivel viajar "
                    + "sem um motorista cadastrado.");
            return false;
        }
        double necessario = viagem.getDistancia()*0.1;
        if(this.nivelCombustivel >= necessario){
            this.nivelCombustivel -= necessario;
            this.distanciaTotalPercorrida += viagem.getDistancia();
     
            this.historicoViagens.add(viagem);
            System.out.println("Viagem de " + viagem.getDistancia() + 
                    " km, na data " + viagem.getData() + 
                    " registrada com sucesso!");
            
            return true;
        }
        System.out.println("Viagem de " + viagem.getDistancia() + " na data " + 
                viagem.getData() + " nao regsitrada: combustivel insuficiente.");
        return false;
    }
    
    public void abastecer(int combustivel){
        this.nivelCombustivel += combustivel;
        System.out.println("Abastecendo: " + combustivel + "L");
        if(this.nivelCombustivel > this.CAPACIDADE_MAX){
            this.nivelCombustivel = this.CAPACIDADE_MAX;
            System.out.println("Aviso: abastecimento excede a capacidade do "
                    + "tanque! Pode haver vazamento.");
        }
        System.out.println("Abastecimento realizado com sucesso.");
    }
    
    public void exibirStatus(){
        System.out.println("Status: " + this.placa + ", " 
                + this.nivelCombustivel + ", " + this.distanciaTotalPercorrida);
    }
    
    public void gerarRelatorioViagem(){
        double totalKm = 0;
        System.out.println("\n--- Relatorio de Viagens ---");
        for(int i=0; i<historicoViagens.size(); i++){
            Viagem v  = historicoViagens.get(i);
            System.out.println("Viagem " + (i+1) + ":");
            System.out.println("Data: " + v.getData());
            System.out.println("Distancia: " + v.getDistancia() + " Km");
            
            totalKm += v.getDistancia();
        }
        
        System.out.println("---------------------------\n");
        System.out.println("Distancia total percorrida: " + totalKm + " Km.");
    }
    
    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null || getClass()!=obj.getClass())return false;
        Veiculo other = (Veiculo)obj;
        return Objects.equals(placa, other.placa);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(placa);
    }
    
    
    
    @Override
    public String toString() {
        return "Veiculo{" +
           "modelo = " + modelo + 
           ", placa = " + placa + 
           ", nivel de combustivel = " + nivelCombustivel + " L" +
           ", motorista = " + (motorista != null ? motorista.getNome() : "null") +
           ", distancia total percorrida = " + distanciaTotalPercorrida + " Km"+
           '}';
    }
    
}
