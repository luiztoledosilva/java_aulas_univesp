/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casasdecimais;

import java.text.DecimalFormat;

/**
 *
 * @author Usuario
 */
public class CasasDecimais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double peso=115, altura=1.76;
        double imc = peso/(altura*altura);
        
        System.out.println("Indice de massa corporal = "  +imc);
         System.out.printf("Indice de massa corporal = %.2f  \n "  , imc);
         System.out.println("Indice de massa corporal = "   +new DecimalFormat(".##").format(imc));
    }
    
}
