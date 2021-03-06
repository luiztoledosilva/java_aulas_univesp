/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytebank.herdado;

public class Gerente extends Funcionario implements Autenticavel {
        private AutenticacaoUtil autenticador;

        public Gerente() {
            this.autenticador = new AutenticacaoUtil();
        }

        public double getBonificacao() {
            System.out.println("Chamando o metodo de bonificacao do GERENTE");
            return super.getSalario();
        }

        @Override
        public void setSenha(int senha) {
            this.autenticador.setSenha(senha);
        }

        @Override
        public boolean autentica(int senha) {
            return this.autenticador.autentica(senha);
        }
}