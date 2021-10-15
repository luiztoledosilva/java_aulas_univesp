/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testalaços;

/**
 *
 * @author Usuario
 */
public class TestaLaços {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                for(int contador = 0; contador <= 10; contador++) {
                    System.out.print(multiplicador * contador);
                    System.out.print(" ");
                }
                System.out.println();
            }
    }
    
}
