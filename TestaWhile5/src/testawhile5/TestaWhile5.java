/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testawhile5;

/**
 *
 * @author Usuario
 */
public class TestaWhile5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        // TODO code application logic here
        //int contador = 0;
            while(contador <= 100) {
                //System.out.println(contador);
                //contador = contador + 1;
                if(contador%2==0){
                    System.out.println(contador);
                    contador++;
                }
            }
        
        
        
    }
    
}
