/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank2;

/**
 *
 * @author Usuario
 */
public class CriaConta2 {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        //Conta primeiraConta = new Conta()
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
          Conta segundaConta = primeiraConta;
        segundaConta.saldo = 50;
        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
    }
    
}
