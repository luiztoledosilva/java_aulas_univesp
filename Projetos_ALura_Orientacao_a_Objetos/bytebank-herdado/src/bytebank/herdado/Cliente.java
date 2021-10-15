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
public class Cliente implements Autenticavel {

        private AutenticacaoUtil util;

        public Cliente() {
            this.util = new AutenticacaoUtil();
        }

        @Override
        public void setSenha(int senha) {
            this.util.setSenha(senha);
        }

        @Override
        public boolean autentica(int senha) {
            if(this.senha == senha) {
                return true;
            } else {
                return false;
            }
        }
}