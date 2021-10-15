/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

/**
 *
 * @author Usuario
 */
public abstract class ProfessorHorista extends ProfessorConcursado {
    
    private int horas_trabalhadas;
    private float salario;

    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setHoras_trabalhadas(int horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }
    
    /**
     *
     */
   
    public void mostrar_salario2(){
        salario=horas_trabalhadas*20;  /// vinte reais por horas trabalhadas no mes 
        System.out.println("salário=R$ " +salario);
    }
    
}
