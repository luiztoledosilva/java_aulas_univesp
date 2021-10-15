/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentomusica;


public class Violao {
    //* atributos 
    String modelo;
    String cor;
    String madeira;
    float valor;
    boolean afinado;
    boolean eletrico;
    
    //* metodos 
     void conectar(){
         if(this.eletrico==true){
             System.out.println("conecte o cabo");
                     
             
             
         }else{
             System.out.println("Nao tem captação eletrica");
         }
         
    
    }
       void afinar(){
           this.afinado=true;
           
       }
       
       void deixarDesafinado(){
          this.afinado=false;
    
        }
       void tocar(){
           if(this.afinado==false){
               System.out.println("Está desafinado");
           }else{
               System.out.println("Está afinado");
           }
       }
       void status(){
           System.out.println("Violao da cor "+this.cor);
           System.out.println("Madeira "+this.madeira);
           System.out.println("Modelo: "+this.modelo);  
           System.out.println("Valor R$"+this.valor);
           System.out.println("Esta afinado? "+this.afinado);
           System.out.println("É elétrico? "+this.eletrico);
       }
       
       
}    