/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintestemap;


import java.util.Map; 

import java.util.TreeMap; 


/**
 *
 * @author Usuario
 */
public class MainTesteMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<Integer,String> nomes = new TreeMap<>(); 

             nomes.put(5,"Joao"); 

             nomes.put(3,"Jose"); 

             nomes.put(2,"Maria"); 

             nomes.put(4,"Julio"); 

             nomes.put(1,"Fernanda"); 

             nomes.put(7,"Heloisa"); 

             nomes.put(6,"Ana"); 

 

             for (String nome : nomes.values()) { 

                    System.out.println(nome); 

             } 
        
        
        
        
        // TODO code application logic here
    }
    
}
