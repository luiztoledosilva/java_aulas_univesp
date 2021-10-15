/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamentoexer;

/**
 *
 * @author Usuario
 */
public class Conta {
    private int agencia;
    private int numero;
    private int saldo;        
    
}
    
    public Conta(int agencia, int numero){
    this.agencia = agencia;
    this.numero = numero;
    this.saldo = 100; //isso significa que toda conta começa com 100 de saldo.
    System.out.println("Estou criando uma conta");
} 
    

