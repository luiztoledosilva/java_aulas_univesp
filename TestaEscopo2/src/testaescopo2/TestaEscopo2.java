/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaescopo2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class TestaEscopo2 {

    /**
     * @param args the command line arguments
     * @param acompanhado
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int idade, quantidadePessoas = 0;
        boolean acompanhado;
        
         System.out.println("Informe a idade: ");
         idade=input.nextInt();
         
         System.out.println("Informe a quantidade de pessoas: ");
         quantidadePessoas=input.nextInt();
     
        
          
         if (quantidadePessoas >= 2) {
             
              acompanhado = true;
                
            }else {
               
               acompanhado = false;
            }
      

            if (idade >=18 || acompanhado){

                System.out.println("Seja bem vindo"); 
            } else {
                System.out.println("infelizmente voce nao pode entrar");
        }
        
        
        
        
    }
    
}
