/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testawhile4;


import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class TestaWhile4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner input = new Scanner(System.in);
      int num=0;
      
      System.out.print("Informe o primeiro numero do intervalo(entre 1 e 50): ");
      num=input.nextInt();
      
      if (num<51){
          int contador=num;
          while(contador<101){
              if(contador%2==0){
                    System.out.println(contador);
                    contador++;
              }
          }
          
      }else{
          System.out.println("Voce digitou numero fora do intervalo");
      }
      
      
      
      
      
      
    }
     
    
}
    