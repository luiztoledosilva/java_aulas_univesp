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
public class Conta {
    
    
    double saldo;
    int agencia=42;
    int numero;
    String titular;
    
    //deposita(double valor);
     public void deposita(double valor) {
        //this.saldo = this.saldo + valor; 
        this.saldo += valor;
    }
    public boolean saca(double valor){
        if(this.saldo>=valor){
            //this.saldo=this.saldo-valor;
            this.saldo -= valor; 
            return true;
        }else{
              return false;  
           }
       
       
    }
    
    public boolean transfere(double valor,Conta destino){
      if(this.saldo >= valor) { 
            this.saldo -= valor; 
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
            
    
}
    
    

