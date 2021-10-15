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
public class Teacher {

    
    public static void main(String[] args) {
        
        
        ProfessorConcursado p1=new ProfessorConcursado() {};
        ProfessorHorista p2;
        p2 = new ProfessorHorista() {};
        
        ProfessorHorista p3;
        p3 = new ProfessorHorista() {};
        
        p1.setNome("Luiz");
        p1.setMatricula(123);
        p1.setSalario(3700f);
        System.out.println(p1.toString());
        p1.mostrar_salario();
        
        p2.setNome("Antonio");
        p2.setMatricula(458);
        p2.setHoras_trabalhadas(40);
        System.out.println(p2.toString());
        p2.mostrar_salario2();
        
        p3.setNome("Julio");
        p3.setMatricula(438);
        p3.setHoras_trabalhadas(50);
        System.out.println(p3.toString());
        p3.mostrar_salario2();
        
        // TODO code application logic here
    }
    
}
