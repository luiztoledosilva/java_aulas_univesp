/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package alunos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Alunos {

   
    public static void main(String[] args) {
       List<String> alunos = new ArrayList();
        ///alunos = new ArrayList();
       
       alunos.add("Douglas");
       alunos.add("Dabio");
       alunos.add("Fernando");
       alunos.add("Felix");
       
       for (String aluno : alunos){
           System.out.println(aluno);
           
           
       }
       //adicionar elementos em lugares específicos do array
       
       alunos.add(1,"Luizao");
        System.out.println("----//----");
        for (String aluno : alunos){
           System.out.println(aluno);
           
           
       }
        //usar o get 
        ///cinco elementos, 0 a 4
        System.out.println("----//----");
        System.out.println(alunos.get(0));
        ///qts elementos na lista?
        System.out.println("Quantos elementos tem?");
        System.out.println(alunos.size());
        //remover elemento da lista 
        
        alunos.remove("Luizao");
        System.out.println("Lista atualizada");
        System.out.println(alunos);
        
        ///inspecionar elemento na lista 
        //contains
        
       boolean temFulano = alunos.contains("Pele");
        System.out.println("Tem esse cara na lista?");
        System.out.println(temFulano);
        alunos.add("Douglas");
        System.out.println("----//----");
        System.out.println(alunos);
       ///lista ordenada
        System.out.println("Lista ordenada");
        Collections.sort(alunos);
        System.out.println(alunos);
       
        
    }
    
}
