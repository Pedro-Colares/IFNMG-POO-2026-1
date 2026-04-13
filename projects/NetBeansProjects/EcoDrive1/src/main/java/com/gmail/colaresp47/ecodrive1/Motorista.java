package com.gmail.colaresp47.ecodrive1;

public class Motorista {
 
    public Motorista() {
        
    }
    
    private String nome;
    private int cnh;
    private Veiculo veiculo;
    private char categoria;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getCnh(){
        return cnh;
    }
    public void setCnh(int cnh){
        this.cnh = cnh;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        if(veiculo!=null && !(this.getCategoria()=='D')){
            System.out.println("Motorista precisa ter categoria D.");
            return;
        }
        this.veiculo = veiculo;
    }
    
    public char getCategoria(){
        return categoria;
    }
    
    public void setCategoria(char categoria){
        this.categoria = categoria; 
    }

    @Override
    public String toString() {
        return "Motorista{" +
           "nome = " + nome +
           ", cnh = " + cnh +
           ", categoria = " + categoria +
           ", veiculo = " + (veiculo != null ? veiculo.getModelo() : "null") +
           '}';
    }              
    
}
