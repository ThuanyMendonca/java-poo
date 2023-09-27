import java.util.Arrays;

public class CriarConta {
    public static void main(String[] args) {
        // Nesse exemplo, são contas diferentes pois referenciam endereços diferentes
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println(segundaConta.saldo);

        System.out.println(primeiraConta); // 36baf30c
        System.out.println(segundaConta); // 7a81197d
    }
}