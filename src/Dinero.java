public abstract class Dinero {
    private int valor;
    private int anyo;

    public Dinero(){

    }

    public Dinero(int valor, int anyo){
        this.valor = valor;
        this.anyo = anyo;
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




    

}
