/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal1000;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Animal1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         ArrayList<Animais> animais = new ArrayList();
        
        //animais.add("gato");
        //animais.add("cachoro");
        
        Animais gato=new Animais("Gata Chiquinha", "tricolor");
       
        Animais cachorro = new Animais("Cao Billy", "amarelo");
        
        animais.add(gato);
        animais.add(cachorro);
        
        for(Animais v: animais){
            System.out.println(v);
            
            
        }
        // TODO code application logic here
    }
    
}
