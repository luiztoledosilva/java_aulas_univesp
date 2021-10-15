
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 ///usando o for
package testawhile3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class TestaWhile3 {
//public class TestaFor na verdade 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ///import java.util.Scanner;
        
         Scanner input = new Scanner(System.in);
          
         
         int n1 = 0,n2=0;
         
         System.out.print("Informe o valor de N1: ");
          n1=input.nextInt();
         
          System.out.print("Informe o valor de N2: ");
          n2=input.nextInt();
         
         
         //System.out.println("Intervalo Positivo");
         if (n1<n2){
             System.out.print("Intervalo Positivo \n");
             for(int contador=n1;contador<=n2;contador++){
               System.out.println(contador);
              //System.out.print("] Donen")
                System.out.print(" ");
                 
             }
             
         }else
          if(n1>n2){
           System.out.print("Intervalo Negativo \n ");  
                 for(var contador2=n1;contador2>=n2;contador2--){
                   System.out.println(contador2); 
                    System.out.print(" ");
             }
             System.out.println();
                 
    }else {
              System.out.println("Numeros sao iguais, n1=n2");
          }
        
        
        
        
        
    }
    
}
