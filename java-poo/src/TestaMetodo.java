import java.util.Arrays;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 50;
        contaDoPaulo.deposita(100);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        contaDaMarcela.transfere(200, contaDoPaulo);
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.titular = "paulo silva";
        contaDaMarcela.titular = "marcela souza";
        System.out.println(contaDoPaulo.titular);
        System.out.println(contaDaMarcela.titular);
    }
}
