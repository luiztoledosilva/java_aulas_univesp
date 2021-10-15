/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canetatest;

/**
 *
 * @author Usuario
 */
public class CanetaTest {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AtributosCanela can1=new AtributosCanela();
        
        can1.setMarca("big");
        can1.setCor("Azul");
        can1.setTamanho(11);
        System.out.println(can1.toString());               
        

    }
    
}
