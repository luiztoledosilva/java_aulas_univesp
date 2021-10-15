
package instrumentomusica;


public class InstrumentoMusica {

   
    public static void main(String[] args) {
        //* Instanciacao de objetos 
        Violao i1=new Violao();
        i1.afinado=true;
        i1.cor="escura";
        i1.eletrico=true;
        i1.madeira="Jacaranda brasileiro";
        i1.valor=987.89f;
        i1.afinar();
        i1.status();
        i1.tocar();
        i1.conectar();
        
        System.out.println("------//------");
        
        Violao i2=new Violao();
        i2.afinado=false;
        i2.cor="clara";
        i2.eletrico=false;
        i2.madeira="abeto canadense";
        i2.valor=2000;
        i2.deixarDesafinado();
        i2.status();
        i2.tocar();
        i2.conectar();
        
        
    }
    
}
