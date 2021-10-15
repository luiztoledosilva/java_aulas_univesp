/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroescolaprincipal;

public abstract class HerdeiroAluno extends Pessoas{
 //public class HerdeiroAluno extends Pessoas
    private int anoingresso;
    private float nota;
    
    public void aprovar(){
        System.out.println("Aluno "+this.nome+ " Aprovado");
    }
    
    public abstract void usarLaboratorio();
    public int getAnoingresso() {
        return anoingresso;
    }

    public void setAnoingresso(int anoingresso) {
        this.anoingresso = anoingresso;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
}
