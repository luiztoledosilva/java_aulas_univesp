/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bola;

/**
 *
 * @author Usuario
 */
public class Bola {
    
    private String material;
    private String cor;
    private int tamanho;
    private boolean cheia;
    
    
   ///construtor material
    
    public Bola(){
        
        
        material = "";
        cor = "";
        tamanho = 0;
        cheia = false;
    }
    
     public Bola(String material, String cor, int tamanho, boolean cheia){
        this.material = material;
        this.cor = cor;
        this.tamanho = tamanho;
        this.cheia = cheia;
    }
     
      public Bola (String cor, int tamanho){
        this.cor = cor;
        this.tamanho = tamanho;
        material = "";
        cheia = false;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void setTamanho (int tamanho){
        this.tamanho =  tamanho;
    }
    
    public void setCheia (boolean cheia){
        this.cheia = cheia;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public String getCor(){
        return cor;
    }
    
    public int getTamanho(){
        return tamanho;
    }
    
    public boolean getCheia(){
        return cheia;
    }
    
    public void pintar(String cor){
        this.cor = cor;
        System.out.println("A bola agora é da cor "+ cor);
    }
    
    public void encher(){
        cheia = true;
        System.out.println("A bola está cheia.");
    }
    
    public void esvaziar(){
        cheia = false;
        System.out.println("A bola está vazia.");
    }
    
            
            

    /**
     * @param args the command line arguments
     */
       /*
    public static void main(String[] args) {
        // TODO code application logic here
    }
    */
   
    
    
}
