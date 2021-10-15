/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *import java.util.ArrayList; and open the template in the editor.
 */

///import java.util.ArrayList;

package exercicioanimais;


import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class ExercicioAnimais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Animais>ListadeAnimais=new ArrayList<>();
        
        Animais gato = new Animais();
        
        Animais cachorro = new Animais();
        
        gato.setNome("Gata Chiquinha");
        gato.setCor("loiro");
        
        cachorro.setNome("Cao Billy");
        cachorro.setCor("Preto");
        
        ListadeAnimais.add(gato);
        ListadeAnimais.add(cachorro);
        
        for(int i=0; i<ListadeAnimais.size();i++){
            
            System.out.println("Nome: " +ListadeAnimais.get(i).getNome());
            System.out.println("Cor: " +ListadeAnimais.get(i).getCor());
            
            
            
        }
       
        
        
        
                
        
        
        
        
        // TODO code application logic here
    }
    
}
