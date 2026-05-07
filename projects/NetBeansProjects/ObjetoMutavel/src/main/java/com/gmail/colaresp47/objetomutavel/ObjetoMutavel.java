package com.gmail.colaresp47.objetomutavel;
import java.util.HashSet;

public class ObjetoMutavel {

    public static void main(String[] args) {
        
        HashSet<Funcionario>set = new HashSet<>();
       
        Funcionario f1 = new Funcionario("Pedro", 10);
        set.add(f1);
        System.out.println(set);
        
        f1.setId(20);
        System.out.println("Apos mudanca: " + set);
        
        boolean removeu = set.remove(f1);
        System.out.println("Removeu: " + removeu);
        
        /*Resposta: Como o objeto f1, ao ser adicionado ao conjunto, possuía
        id = 10, então foi armazenado em uma posição baseada nesse hash. Depois,
        o id é alterado para 20, e o valo do hashCode() também muda. Mas ao
        tentar remover, o hashSet procura na posição correspondente ao novo
        hash(20) e não encontra o objeto, porque ele ainda está armazenado na
        antiga posição. Por isso, equals() e hashCode() devem ser imutáveis.
        */ 

    }
}
