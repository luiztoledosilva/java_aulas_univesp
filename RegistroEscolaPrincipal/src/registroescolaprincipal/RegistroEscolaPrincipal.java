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
public class RegistroEscolaPrincipal {

  
    public static void main(String[] args) {
      //Pessoas p1=new Pessoas;  nao pode
      HerdeiroAlunoOitava a1=new HerdeiroAlunoOitava();
      AlunoTerceiroColegial a2=new AlunoTerceiroColegial();
      
      //HerdeiroAluno a1 = new HerdeiroAluno();
      a1.setNome("Fernando");
      a1.setAnoingresso(2015);
      a1.setIdade(16);
      a1.setNota(6.8f);
      a1.setPresenca(213);
      a1.setSexo("M");
      System.out.println(a1.toString());
      a1.aprovar();
      a1.usarLaboratorio();
      
      a2.setNome("Alice");
      a2.setAnoingresso(2018);
      a2.setIdade(17);
      a2.setNota(8.5f);
      a2.setPresenca(212);
      a2.setSexo("F");
      System.out.println(a2.toString());
      a2.aprovar();
      a2.usarLaboratorio();
      
      HerdeiroTutor t1=new HerdeiroTutor();
      t1.setIdade(42);
      t1.setNome("Joao");
      t1.setPresenca(11);
      t1.setSexo("M");
      System.out.println(t1.toString());
      
      HerdeiroProfessor p1=new HerdeiroProfessor();
      p1.setIdade(43);
      p1.setMateria("Historia");
      p1.setNome("Plinio");
      p1.setPresenca(11);
      p1.setSalario(3600.89f);
      p1.setSexo("M");
      System.out.println(p1.toString());
      p1.fazerRelatorio();
      
              
        
    }
    
}
