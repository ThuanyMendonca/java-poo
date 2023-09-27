import java.util.Arrays;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1234, 82983);

        conta.setNumero(1233);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("paulo");
        System.out.println(paulo.getNome());

        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("dev");
        System.out.println(conta.getTitular().getProfissao());

        // de outra forma...
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
        System.out.println(titularDaConta.getProfissao());
        System.out.println(conta.getTitular().getProfissao());

    }
}