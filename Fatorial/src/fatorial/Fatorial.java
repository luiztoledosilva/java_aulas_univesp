/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         int numero;
         
         System.out.println("Informe o numero para o fatorial: ");
          numero=input.nextInt();
          int fatorial=1;
          for(int i=1;i<=numero;i++){
              fatorial *= i;
              
              
              
          }
         
         System.out.println(fatorial);
        
        
        
    }
    
}
