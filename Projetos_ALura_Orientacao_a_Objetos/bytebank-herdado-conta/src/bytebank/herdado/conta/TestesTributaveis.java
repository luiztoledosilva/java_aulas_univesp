/*
 * To change th license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank.herdado.conta;

/**
 *
 * @author Usuario
 */
public class TestesTributaveis {
    
    public static void main(String[] args){
        
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100.0);
        
        SeguroDeVida seguro = new SeguroDeVida();
        CalculadoraDeImposto calc = new CalculadoraDeImposto();
        
        calc.registra(cc);
        calc.registra(seguro);
        
        System.out.println(calc.getTotalImposto());
        
        
    }
    
}
