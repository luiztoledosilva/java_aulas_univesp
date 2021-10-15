/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author Usuario
 */
public class Genericos {
    
    private Object t; 

 

public Object get() { 

return t; 

} 

 

public void set(Object t) { 

this.t = t; 

} 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Genericos type = new Genericos(); 

        type.set("Teste");  

        String str = (String) type.get();  
        
        // TODO code application logic here
    }
    
}
