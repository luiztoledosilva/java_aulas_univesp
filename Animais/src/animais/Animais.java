/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Animais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create ArrayList
     List<String> myList = new ArrayList<>();
     myList.add("leao");
     myList.add("sapo");
     myList.add("cachorro");
     myList.forEach((listElements) -> {
         System.out.println(listElements);
        });

    }

}