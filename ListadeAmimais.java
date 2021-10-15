package listadeamimais;

import java.util.ArrayList;

public class ListadeAmimais {

    public static void main(String[] args) {

        ArrayList<Animal> tiposAnimais = new ArrayList<>();

        Animal gato = new Animal();
        Animal cachorro = new Animal();

        gato.setNome("Gata Chiquinha");
        gato.setCor("Tricolor: branco, preto e loiro");

        cachorro.setNome("Cachorro Billy");
        cachorro.setCor("Branco e preto");

        tiposAnimais.add(gato);
        tiposAnimais.add(cachorro);
        //int i = 0;

        for(int i=0; i < tiposAnimais.size(); i++){
            System.out.println("Nome: " + tiposAnimais.get(i).getNome());
            System.out.println("Cor: " + tiposAnimais.get(i).getCor());
            System.out.println("\n ");
        }


        // TODO code application logic here
    }

}
