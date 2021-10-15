/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesalario;


import java.util.Scanner;

import java.text.DecimalFormat;

/**
 *
 * @author Usuario
 */
public class TesteSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         
         double salario;
         
         //boolean promovido=true;
         
         System.out.println("Informe o valor do Salario R$: ");
         salario=input.nextDouble();
         
         boolean promovido=true;
         
         if(salario<=2400){
             ///boolean promovido=true;
             promovido=true;
             
         }else{
             
             promovido=false;
         }
         
         System.out.println("Promovido = " + promovido);
             
         
         ///System.out.println("O salario é de R$%.2f " , salario);
          System.out.printf("salario = R$ %.2f  \n "  , salario);
        
        
    }
    
}
