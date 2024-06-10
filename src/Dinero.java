import java.io.Serializable;

public abstract class Dinero implements Serializable {
    private int valor;
    private int anyo;

    public Dinero(){

    }

    public Dinero(int valor, int anyo){
        this.valor = valor;
        this.anyo = anyo;
    }

    public Dinero(Dinero dinero){
        dinero.setAnyo(this.getAnyo());
        dinero.setValor(this.getValor());
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

    public void compareTo(Dinero din){//arreglar
        if(din.anyo > this.anyo){
            System.out.println("El " + din.toString() + " su año es mayor que el de " + this.toString());
        }else if(din.anyo < this.anyo){
            System.out.println(this.toString() + " su año es mayor que el de " + din.toString());
        }else if(din.anyo == this.anyo){
            System.out.println("El " + din.toString() + " el año es igual que el de " + this.toString());
        }

        if(din.valor > this.valor){
            System.out.println("El " + din.toString() + " su valor es mayor que el de " + this.toString());
        }else if(din.valor < this.valor){
            System.out.println(this.toString() + " su valor es mayor que el de " + din.toString());
        }else if(din.valor == this.valor){
            System.out.println("El " + din.toString() + " el valor es igual que el de " + this.toString());
        }

    }

}
