/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobanco;

/**
 *
 * @author Usuario
 */
public class ProjetoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta1 conta = new Conta1();
        
       
        conta.setSaldo(1500);
         System.out.println(conta.getSaldo());
         
         conta.setAgencia(0222);
         System.out.println(conta.getAgencia());
        
         conta.setNumero(1222);
         System.out.println(conta.getNumero());
         
         conta.setTitular("Luiz Silva");
         System.out.println(conta.getTitular());
         
          
        
     
        
    }

  

}