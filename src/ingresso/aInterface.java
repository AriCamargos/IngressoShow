package ingresso;
public class aInterface {

    public aInterface(){
        System.out.println(" ★ SHOW INTERNACIONAL MADONNA ★ ");
        System.out.println("Veja a tabela de valores abaixo ↓ \n");
    }

    public double mostrarValorIngresso(double reais) {
        System.out.println("• O valor do Ingresso na Pista é de " + reais + " reais;");
        return reais;
    }

    void mostrarDiferenca(double diferenca) {
         System.out.println("• A diferença do valor do Ingresso na Pista e Ingresso Vip é de " + diferenca + " reais;");
    }

    void mostrarTotalIngresso(double soma) {
        System.out.println("• O valor do Ingresso Pista + Ingresso Vip fica no total de " + soma + " reais.");
    }

}
