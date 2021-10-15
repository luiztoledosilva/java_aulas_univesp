/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conjuntos;

/**
 *
 * @author Usuario
 */
public class DepartamentoGraduacao {
    
    private int cadastro;
    private String nome;

    public DepartamentoGraduacao(int cadastro, String nome) {
        this.cadastro = cadastro;
        this.nome = nome;
    }

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "cadastro=" + cadastro + ", nome=" + nome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.cadastro;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DepartamentoGraduacao other = (DepartamentoGraduacao) obj;
        if (this.cadastro != other.cadastro) {
            return false;
        }
        return true;
    }
     
    
    
}
