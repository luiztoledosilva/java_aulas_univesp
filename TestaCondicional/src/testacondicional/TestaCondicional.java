/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testacondicional;

/**
 *
 * @author Usuario
 */
public class TestaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Testando condicionais ");
        //int idade=20;
        int idade=17;
        int quantidadePessoas=3;
        if (idade>=18){
            System.out.println("Voce tem mais de 18 anos");
        }else if (quantidadePessoas>=2)
           {
               System.out.println("Voce nao tem 18 anos, mas por estar acompanhado pode entrar");
           }
         
        else{
                System.out.println("Infelizmente você nao pode entrar!");
                }
         
        
    }
    

}