package ingresso;
public class Ingresso {
    protected double reais;
    
    //construtor
    public Ingresso(double reais) {
        this.reais = reais;
    }

    //metodo que imprimi o valor do ingresso normal
    public void mostrarValor(){
        this.reais = reais;
    }

    public double calcularAdicional(){
        return 0;
    }

}