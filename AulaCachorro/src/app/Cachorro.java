/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

/**
 *
 * @author Angelo2
 */
public class Cachorro {
    //Declaração dos atributos da classe
    String raca;
    String nome;
    String porte;
    double peso;
    int idade;
    int idadeMaxima;
    double pesoMaximo;
    
    /**
     * Método que envelhece o animal em 1 ano.
     */
    public void envelhecer(){
        idade = idade+1;
    }
    
    /**
     * Método que engorda o animal em 10%.
     */
    public void alimentar(){
        peso = peso + (peso * 0.1);
    }
    
    /**
     * Método reduz o peso do animal em 5%.
     */
    public void correr(){
        peso = peso - (peso * 0.05);
    }
    
    /**
     * Método que verifica o Status do animal.
     */
    public void verificarStatus(){
        System.err.println("STATUS"+ nome+
                  "\nPESO: "+peso+" PESO MÁXIMO: "+pesoMaximo+"\n"
                + "IDADE: "+idade+" IDADE MÁXIMA: "+idadeMaxima);
    }
}
