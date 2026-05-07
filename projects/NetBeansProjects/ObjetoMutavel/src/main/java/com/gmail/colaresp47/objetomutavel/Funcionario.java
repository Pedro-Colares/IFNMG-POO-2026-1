package com.gmail.colaresp47.objetomutavel;

import java.util.Objects;

public class Funcionario {
    
    private String nome;
    private int id;

    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)return true;
        if (obj==null || getClass()!=obj.getClass())return false;
        Funcionario other = (Funcionario) obj;
        return this.id == other.id;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(this.id);
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", id=" + id + '}';
    }
    
    
    
}
