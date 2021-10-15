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
public class HerdeiroProfessor extends Pessoas{
    private float salario;
    private String materia;
    
    public void fazerRelatorio(){
        System.out.println("Fez relatorio");
        
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
}
