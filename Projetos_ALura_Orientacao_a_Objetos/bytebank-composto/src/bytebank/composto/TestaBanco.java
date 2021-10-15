/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank.composto;

/**
 *
 * @author Usuario
 */
public class TestaBanco { 
    public static void main(String[] args) { 
        Cliente paulo = new Cliente(); 
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta(); 
        contaDoPaulo.deposita(100);

        contaDoPaulo.Cliente titular = paulo; 
        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular);
    }
}