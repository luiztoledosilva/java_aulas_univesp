/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeexcecao;

/**
 *
 * @author Usuario
 */
public class TesteExcecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   try{   
        String texto = null; 

    String novoTexto = null; 

    novoTexto = texto.toUpperCase(); 

    System.out.println("Texto antigo: "+texto); 

    System.out.println("Texto novo: "+novoTexto); 
        
        
        
        
    }catch(NullPointerException ex0){
        
        System.out.println("String nao pode começar com null");
    }
    } 
}

  



////tipo de excecao Exception in thread "main" java.lang.NullPointerException////