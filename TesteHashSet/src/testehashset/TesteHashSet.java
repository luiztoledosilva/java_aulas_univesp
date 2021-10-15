/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testehashset;

import java.util.LinkedHashSet; 

import java.util.Set; 



/**
 *
 * @author Usuario
 */
public class TesteHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Set<String> nomes = new LinkedHashSet<>(); 

             nomes.add("Joao"); 

             nomes.add("Jose"); 

             nomes.add("Maria"); 

             nomes.add("Julio"); 

             nomes.add("Fernanda"); 

             nomes.add("Heloisa"); 

             nomes.add("Ana"); 

             for (String nome : nomes) { 

                    System.out.println(nome); 

             } 

       } 
        
        
        
        // TODO code application logic here
    }
    

