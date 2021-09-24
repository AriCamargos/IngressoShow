package ingresso;
public class Gerente {
    protected aInterface umaI;
    protected Ingresso ing;
    protected IngressoVIP ingVip;
    
    public void faca(){
        this.ing = new Ingresso(1); // crio o objeto ingresso 
        double reais = this.umaI.mostrarValorIngresso(200); //mostro o valor do ingresso
        this.ingVip = new IngressoVIP(200, 450); // crio o objeto ingressoVip
        double soma = this.ingVip.calcularAdicional();
        this.umaI.mostrarTotalIngresso(soma);
        double diferenca = this.ingVip.calcularDiferenca(); //falo pra minha classe ingresso, calcular a diferença
        this.umaI.mostrarDiferenca(diferenca); // mando a interfce mostrar a diferença
        //this.umaI.mostrarCalculoIngresso(add); //falo pra interface mostrar a diferença pro usuário
    }
    
    public Gerente(){
        this.umaI = new aInterface();
    }
}
