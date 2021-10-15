/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank.herdado.conta;

/**
 *
 * @author Usuario
 */
public class ContaCorrente extends Conta implements Tributavel {
    
    public ContaCorrente(int agencia, int numero) {
            super(agencia, numero);
        }

    @Override
    public boolean saca(double valor) {
        double valorASacar=valor+0.2;
        return super.saca(valorASacar); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
         return super.saldo*0.01;
    }
 
    
    
    
   
}
