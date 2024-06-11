import java.io.Serializable;

public abstract class Dinero implements Serializable, Comparable<Dinero> {
    private int valor;
    private int anyo;

    public Dinero(){

    }

    public Dinero(int valor, int anyo){
        this.valor = valor;
        this.anyo = anyo;
    }

    public Dinero(Dinero dinero){
        this.anyo = dinero.anyo;
        this.valor = dinero.valor;
    }
    
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getAnyo() {
        return anyo;
    }
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public boolean equals(Object din){
        return false;
    }
    
    
    public String toString(){
        return "El año es: " + anyo + " El valor es: " + valor;
    }

    public int compareTo(Dinero din){//arreglar
        int resultado = Integer.compare(this.valor, din.valor);
        if (resultado == 0) {
            resultado = Integer.compare(this.anyo, din.anyo);
        }
        return resultado;

    }

}
