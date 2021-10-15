/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeamimais;

//import java.util.ArrayList;
import java.util.ArrayList;
public class ListadeAmimais {
    
    public static void main(String[] args) {
        
        
        ArrayList<Animal>TiposAnimais=new ArrayList<> ();
        
        Animal Gato=new Animal();
        
        Animal Cachorro=new Animal();
        
        Gato.setNome(" Gata Chiquinha");
        Gato.setCor("Tricolor: branco, preto e loiro");
        
        Cachorro.setNome("Cachorro Billy");
        
        Cachorro.setCor("Branco e preto");
        
        TiposAnimais.add(Gato);
        TiposAnimais.add(Cachorro);
        //int i = 0;
        
        
        for(int i=0; i<TiposAnimais.size();i++){
            System.out.println("Nome: " +TiposAnimais.get(i).getNome());
             System.out.println("Cor: " +TiposAnimais.get(i).getCor());
             System.out.println("\n ");
            
        
            
            
            
        }
            
      
          // TODO code application logic here
    }
    
}
