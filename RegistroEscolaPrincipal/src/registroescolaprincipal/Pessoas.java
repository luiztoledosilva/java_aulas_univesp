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
public abstract class Pessoas { ///classe mae ou progenitora, nao tem objetos
    protected String nome;
    protected String sexo;
    protected int idade;
    protected int presenca;
    
    public void contarPresenca(){
        this.presenca++;
        
                
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPresenca() {
        return presenca;
    }

    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }

    @Override
    public String toString() {
        return "Pessoas{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", presenca=" + presenca + '}';
    }
    
}
