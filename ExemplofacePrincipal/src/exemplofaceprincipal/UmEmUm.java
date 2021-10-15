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
public class UmEmUm implements InterfaceNossa{
    
    int valor;
    
    UmEmUm(){
    
    valor=0;
}

    @Override
    public int proximo() {
        
        valor +=1;
        return valor;
    }
    
}
