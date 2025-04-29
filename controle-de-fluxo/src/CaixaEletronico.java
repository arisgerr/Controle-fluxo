public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 52.0;
        double valorSolicitado = 15.07;

        if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);
        
    }
}
