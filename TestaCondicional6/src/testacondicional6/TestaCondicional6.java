/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testacondicional6;

/**
 *
 * @author Usuario
 */
public class TestaCondicional6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("testando condicionais");

            int idade = 16;
            int quantidadePessoas = 3;
            boolean acompanhado = quantidadePessoas >= 2;

            if (idade >=18 && acompanhado){

                System.out.println("Seja bem vindo"); 
            } else {
                System.out.println("infelizmente voce nao pode entrar");
        }
    }
    
}
