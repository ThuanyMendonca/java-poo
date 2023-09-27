import java.util.Arrays;

public class TesteReferencias {

    public static void main(String[] args) {
        // Nesse exemplo, estão referenciando o mesmo endereço
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println(primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println(segundaConta.saldo);
        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("são a mesma conta");
        }

        System.out.println(primeiraConta); //36baf30c
        System.out.println(segundaConta); //36baf30c
    }
}
