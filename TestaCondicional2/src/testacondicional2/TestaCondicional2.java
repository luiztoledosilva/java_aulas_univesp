/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testacondicional2;

/**
 *
 * @author Usuario
 */
public class TestaCondicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Testando condicionais ");
        int idade=20;
        //int idade=17;
        int quantidadePessoas=3;
        //boolean acompanhado=true;
        boolean acompanhado = quantidadePessoas>=2;
        System.out.println("Valor acompanhado " +acompanhado);
        if (idade>=18 && acompanhado){ ///expressao booleana 
            //System.out.println("Voce tem mais de 18 anos");
            System.out.println("Seja bem vindo!");
        }
        else{
                System.out.println("Infelizmente você nao pode entrar!");
                }
    }
    
   
    
    
    
    
}
////// operador e = && e operador ou = || no java 

///no boolean é true ou false, nao aceitando numero 

//true e false sao palavras reservadas do java 