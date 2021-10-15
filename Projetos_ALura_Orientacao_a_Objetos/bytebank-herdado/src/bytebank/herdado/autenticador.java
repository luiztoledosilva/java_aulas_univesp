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
public class autenticador implements Autenticavel {
    
    ///private int senha;
    private AutenticacaoUtil autenticador;
    //private int senha;
    
    public autenticador(){
       this.autenticador = new AutenticacaoUtil();
    }
    
    
    
    

    @Override
    public void setSenha(int senha) {
         //To change body of generated methods, choose Tools | Templates.
         this.Autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        
        //To change body of generated methods, choose Tools | Templates.
        return this.Autenticador.autentica(senha);
        //return autenticou;
    }

    
    
}
