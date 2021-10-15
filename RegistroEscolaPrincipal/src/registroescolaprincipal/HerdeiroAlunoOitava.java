/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroescolaprincipal;

/**
 *
 * @author Usuario
 */
public class HerdeiroAlunoOitava extends HerdeiroAluno {

    @Override  ///sobreposicao 
    public void usarLaboratorio() {
        System.out.println("Laboratório 8ª série:segunda, quarta, sexta");
    }
    
}
