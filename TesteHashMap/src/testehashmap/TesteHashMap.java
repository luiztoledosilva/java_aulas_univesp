/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testehashmap;

import java.util.HashMap; 

import java.util.Map; 
/**
 *
 * @author Usuario
 */
public class TesteHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<Integer,String> nomes = new HashMap<>(); 

             nomes.put(5,"Joao"); 

             nomes.put(3,"Jose"); 

             nomes.put(2,"Maria"); 

             nomes.put(4,"Julio"); 

             nomes.put(1,"Fernanda"); 

             nomes.put(7,"Heloisa"); 

             nomes.put(6,"Ana"); 

 

             nomes.values().forEach((nome) -> {
                 System.out.println(nome);
        }); // TODO code application logic here
    }
    
}
