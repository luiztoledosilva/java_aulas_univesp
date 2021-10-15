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
public abstract class ProfessorHorista extends Professores {
    
    private int horas_trabalhadas;
    
    private float salario;

    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setHoras_trabalhadas(int horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }
    
    public void salario(int horas_trabalhadas){
        //float salario;
        salario = horas_trabalhadas*20;
        
    }

    @Override
    public String toString() {
        return "ProfessorHorista{" + "horas_trabalhadas=" + horas_trabalhadas + ", salario=R$ " + salario + '}';
    }
    
    
}
