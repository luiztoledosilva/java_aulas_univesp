/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professores;

/**
 *
 * @author Usuario
 */
public abstract class Professores {
    
    protected String nome;
    protected int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Professores{" + "nome=" + nome + ", matricula=" + matricula + '}';
    }
    
    
    

}





 
    

    
    
    

    
    
    
