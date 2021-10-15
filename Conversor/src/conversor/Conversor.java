/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;
public class Conversor {
    
    static double celsiusfahrenheit(double c){
       double f=9*c/5+32;
       return f; }
    
     static double fahrenheitcelsius(double f){
        double c=(f-32)*5/9;
        return c; }
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fahrenheit,celsius;
        Scanner leitura=new Scanner(System.in);
        
        System.out.print("Indique a temperatura em fahrenheit: ");
        fahrenheit=leitura.nextDouble();
        celsius=fahrenheitcelsius(fahrenheit);
        System.out.println("corresponde a " +celsius+ " graus Celsius");
        
        System.out.print("Indique a temperatura em celsius: ");
        celsius=leitura.nextDouble();
        fahrenheit=celsiusfahrenheit(celsius);
        System.out.println("corresponde a " +fahrenheit+ " graus Fahrenheit");
        
        
    }
    
}
