/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank.herdado;

/**
 *
 * @author Usuario
 */
public abstract interface Autenticavel {

    ///private int senha;

        public abstract void setSenha(int senha);

        public abstract boolean autentica(int senha);
            
    
    
}
