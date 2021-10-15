/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EixoComputacao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> cursos= new TreeMap<>();
        cursos.put("BTI", 3);
        cursos.put("Ciencias de Dados", 4);
        cursos.put("Engenharia da Computacao", 5);
         cursos.put("Engenharia da Computacao", 10);
        Integer duracao = cursos.get("Engenharia da Computação");
        
        System.out.println(duracao);
        
        boolean temEsseCurso = cursos.containsKey("Ciencias de Dados");
        System.out.println(temEsseCurso);
        
        System.out.println(cursos);
        
        Set<String> chaves = cursos.keySet();
        System.out.println(chaves);
        
        cursos.entrySet().forEach((entrada) -> {
            System.out.println(entrada.getKey() + " tem duracao de " +entrada.getValue() + " anos");
        });
        
    }
    
}
