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
public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular; 
    String cpf; 
    String profissão;

  public void deposita(double valor){
          
      this.saldo += valor;
        
    }
  
  public boolean saca(double valor){
      if(this.saldo>=valor){
          this.saldo -= valor;
          return true;
            
      }else{
          return false;
      }
      
      
  }

} 
    

    
    

