/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testacondicional5;

/**
 *
 * @author Usuario
 */
public class TestaCondicional5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("testando condicionais");

            int idade = 16;
            boolean acompanhado = true;

            if (idade >=18 && acompanhado){

                System.out.println("Seja bem vindo"); 
            } else {
                System.out.println("infelizmente voce nao pode entrar");
        }
    }
    
}
