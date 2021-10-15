
 
package canetatest;

/**
 *
 * @author Usuario
 */
public class AtributosCanela {
    private String marca;
    private String cor;
    private int tamanho;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "AtributosCanela{" + "marca=" + marca + ", cor=" + cor + ", tamanho=" + tamanho + '}';
    }
    
    
}


