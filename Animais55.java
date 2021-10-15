import java.util.ArrayList;

class Animais55 {
  public static void main(String[] args){

    
    ArrayList<String> animal = new ArrayList<>();

    // Add elements to ArrayList
    animal.add("leao");
    animal.add("sapo");
    animal.add("cachorro");
    System.out.println("ArrayList: " + animal);
    animal.add(1, "gato");
    System.out.println("ArrayList: " + animal);
    animal.add(2,"cobra");
    System.out.println("ArrayList: " + animal);
    //animal.sort();
    //System.out.println("ArrayList: " + animal);

  }
}


////link https://www.programiz.com/java-programming/arraylist