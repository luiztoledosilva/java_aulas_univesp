/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

/**
 *
 * @author Usuario
 * @param <T>
 * @param <S>
 */
public class Tipos<T, S> {
    
    private T ob;
    private T ob2;
    
    public Tipos(T ob, S ob2){
        this.ob = ob;
        this.ob2 = (T) ob2;
        
    }
    public void mostrarTipo(){
        System.out.println(ob.getClass().getName());
          System.out.println(ob2.getClass().getName());
    }
   
    public String toString(){
       return this.ob + ", " + this.ob2;
        
    }
    
    public static void main(String[] args) {
         
        Tipos<Integer, String> obj1 = new Tipos(4, "quatro");
        Tipos<Integer, String> obj2 = new Tipos(7, "sete");
        obj1.mostrarTipo();
        obj2.mostrarTipo();
        
        System.out.println(obj1);
        System.out.println(obj2);
      
    }
    
}
