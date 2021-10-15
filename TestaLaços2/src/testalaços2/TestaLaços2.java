/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testalaços2;

/**
 *
 * @author Usuario
 */
public class TestaLaços2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int linha = 0; linha < 10; linha++) {
            for(int coluna = 0; coluna < 10; coluna++) {
                if(coluna > linha) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
