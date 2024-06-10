import java.io.Serializable;

public class Moneda extends Dinero{
    private double diametro;
    private double peso;


    public Moneda(){
        super();
    }

    public Moneda(int valor, int anyo,double diametro, double peso){
        super(valor, anyo);
        this.diametro = diametro;
        this.peso = peso;
    }

    public Moneda(Moneda mon){
        mon.setAnyo(this.getAnyo());
        mon.setValor(this.getValor());
        mon.setDiametro(this.getDiametro());
        mon.setPeso(this.getPeso());
    }


    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object mon){
        if(this == mon) return true;
        if (mon == null) return false;
        if (getClass() != mon.getClass()) return false;

        final Moneda other = (Moneda)mon;
        if (this.getValor() != other.getValor()) return false;
        if (this.getAnyo() != other.getAnyo()) return false;
        return true;
    }

    @Override
    public String toString(){
        return "MONEDA " + super.toString() + " El diametro es: " + diametro + " La peso es: " + peso;
    }
    
}
