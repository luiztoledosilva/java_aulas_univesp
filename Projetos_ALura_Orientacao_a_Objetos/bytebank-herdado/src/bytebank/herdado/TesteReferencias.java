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
public class TesteReferencias {
    
     public static void main(String[] args) {
         
         Gerente g1 = new Gerente();
         //Funcionario g1 = new Gerente();
         g1.setNome("LUIZ");
        //String nome=g1.getNome();
         //System.out.println(nome);
         g1.setSalario(5000);
         
         //Funcionario f= new Funcionario();
         //f.setSalario(2499.00);
         
         EditorVideo ev = new EditorVideo();
         ev.setSalario(2500.00);
         
         Designer d = new Designer();
         d.setSalario(2000.00);
        
         
         ControleBonificacao controle = new ControleBonificacao();
         controle.registra(g1);
         //controle.registra(f);
         controle.registra(ev);
         controle.registra(d);
         
         
         System.out.println(controle.getSoma());
    
}

}