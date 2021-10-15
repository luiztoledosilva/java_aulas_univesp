
package instrumentomusica2;


public class Violao2 {
    //*atributos 
    private String modelo;
    private String cor;
    private String madeira;
    public float valor;
    
    // metodos
    
    public String getModelo(){
        return this.modelo;
        
    }
    
    public void setModelo(String m){
        this.modelo=m;
    }
    public String getCor(){
        return this.cor;
        
    }
    public void setCor(String c){
       this.cor=c;
    }
    public String getMadeira(){
        return this.madeira;
    }
    
    public void setMadeira(String mad){
        this.madeira=mad;
    }
            
    void status(){
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Cor: "+this.getCor());
        System.out.println("Madeira: "+this.getMadeira());
        System.out.println("valor: "+this.valor);
    }
    
}
