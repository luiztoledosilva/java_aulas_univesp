/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deducao;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Deducao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ////import java.util.Scanner;
       Scanner input = new Scanner(System.in);
       
       double salario=0, conta=0;
       
        System.out.println("Informe o salario para saber o quanto pagará de imposto de renda R$: ");
        salario=input.nextDouble();
        
        if(salario<=1900){
            
            //conta=0;
            System.out.println("Isento de imposto");
        }else
          if(salario>1900 && salario<=2800){
            
            conta=salario*0.075-142;
            System.out.printf("O imposto retido = R$ %.2f  \n "  , conta);
        }else
          if(salario>2800 && salario<=3750){
            
            conta=salario*0.15-350;
           System.out.printf("O imposto retido = R$ %.2f  \n "  , conta);
        }else{
            
            conta=salario*0.225-636;
            System.out.printf("O imposto retido = R$ %.2f  \n "  , conta);
        }
        
        
         ////System.out.printf("O imposto retido = R$ %.2f  \n "  , conta);
        
        
        
        
             // TODO code application logic here
    }
    
}
