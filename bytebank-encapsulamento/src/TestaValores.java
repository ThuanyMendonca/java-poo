public class TestaValores {
    public static void main(String[] args) {
        int total = 0;
        Conta conta = new Conta(1212, 873490);

        /* a conta está inconsistente
        conta.setNumero(-3000);
        conta.setAgencia(-30); */

        System.out.println(conta.getNumero());
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1212,123423);
        Conta conta3 = new Conta(1212,123124);

        System.out.println("número total de contas: " + Conta.getTotal());

    }
}
