public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 12.0;
        double valorSolicitado = 15.07;

        if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        else 
           System.out.println("Saldo insuficiente");

        System.out.println(saldo);
        
    }
}
