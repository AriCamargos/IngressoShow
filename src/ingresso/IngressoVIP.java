package ingresso;
public class IngressoVIP extends Ingresso {
    //protected double r;
    protected double valorAdicional;

    //construtor
    public IngressoVIP(double reais, double valorAdicional) {
        super(reais);
        this.valorAdicional = valorAdicional;
    }

    //método que retorna o valor do ingresso com o valor adicional
    @Override
    public double calcularAdicional(){
        double add = (this.reais + this.valorAdicional);
        return add;
    }
    
    //método que calcula a diferença
    public double calcularDiferenca(){
        double dif = ( this.valorAdicional - this.reais);
        return dif;
    }

}