/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank.herdado;

/**
 *
 * @author Usuario
 */
public class TesteFuncionario {
     public static void main(String[] args) {
        // TODO code application logic here
        
        autenticador cliente=new autenticador();
        ///cliente.setSalario(3000);
        
        Gerente Kiko = new Gerente();
        Kiko.setNome("Luiz Francisco Marques de Toledo Silva");
        Kiko.setCpf("344.572.728-76");
        Kiko.setSalario(1500.00);
        
        System.out.println(Kiko.getNome());
        System.out.println(Kiko.getBonificacao());

        
        
     }       
        
}   
   