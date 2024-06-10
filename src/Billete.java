public class Billete extends Dinero{
    private double altura;
    private double anchura;

    public Billete(){
        super();
    }

    public Billete(int valor, int anyo,double altura, double anchura){
        super(valor, anyo);
        this.altura = altura;
        this.anchura = anchura;
    }

    
    public Billete(Object bill){
        ((Dinero) bill).setAnyo(this.getAnyo());
        ((Dinero) bill).setValor(this.getValor());
        ((Billete) bill).setAltura(this.getAltura());
        ((Billete) bill).setAnchura(this.getAnchura());
    }

    @Override
    public boolean equals(Object bill){
        if(this == bill) return true;
        if (bill == null) return false;
        if (getClass() != bill.getClass()) return false;

        final Billete other = (Billete)bill;
        if (this.getValor() != other.getValor()) return false;
        if (this.getAnyo() != other.getAnyo()) return false;
        return true;
    }

    @Override
    public String toString(){
        return "BILLETE " + super.toString() + " La altura es: " + altura + " La anchura es: " + anchura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }


        
}
