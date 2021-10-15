/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double base = 0, altura = 0, areaRetangulo;
        
        System.out.println("Informe o valor da Base: ");
        base=input.nextDouble();
        
        System.out.println("Informe o valor da Altura: ");
        altura=input.nextDouble();
        
        areaRetangulo=base*altura;
        
        
        
        System.out.println("A area da base é = " +base);
        System.out.println("e altura " +altura);
        System.out.println("A area = " +areaRetangulo);
        
        
        
    }
    
    
    
    
    
    
}
