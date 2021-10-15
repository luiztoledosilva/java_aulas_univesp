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
public class TesteGerente {
    
    public static void main(String[] args) {
        
        ///Funcionario gerente = new Gerente();
        Autenticavel referencia = new Administrador();
        
        Gerente g1 = new Gerente();
   
        g1.setNome("Luiz");
        g1.setCpf("34457272788");
        g1.setSalario(5000.00);
        
        System.out.println(g1.getNome());
         System.out.println(g1.getCpf());
          System.out.println(g1.getSalario());
          
          g1.setSenha(2222);
          boolean autenticou = g1.autentica(2222);
          System.out.println(autenticou);
          System.out.println(g1.getBonificacao());
        
    }
    
}
