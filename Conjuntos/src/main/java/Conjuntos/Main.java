/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Set<String> alunos = new HashSet<>();
        Set<DepartamentoGraduacao> discentes = new LinkedHashSet<>();
        //Set<String> alunos = new TreeSet<>();
        discentes.add(new DepartamentoGraduacao(1,"Luizao"));
        discentes.add(new DepartamentoGraduacao(2,"Douglas"));
        discentes.add(new DepartamentoGraduacao(3,"Dabio"));
         discentes.add(new DepartamentoGraduacao(2,"Fernando"));
         
        discentes.add(new DepartamentoGraduacao(5,"Fernando"));
        System.out.println(discentes);
        System.out.println(discentes.size());
        
        
    }
    
}
