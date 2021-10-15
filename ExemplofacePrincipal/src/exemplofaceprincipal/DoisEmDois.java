/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplofaceprincipal;

/**
 *
 * @author Usuario
 */
public class DoisEmDois implements InterfaceNossa {
    
     int valor;
    
    DoisEmDois(){
    
    valor=0;
}

    @Override
    public int proximo() {
        
        valor +=2;
        return valor;
    }
    
    
}
