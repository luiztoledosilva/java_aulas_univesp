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
public abstract class ProfessorConcursado extends Professores {
    
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

   public void mostrar_salario(){
       System.out.println("salario= R$ " +salario);
       
       
   }

    
    
    
    
}
