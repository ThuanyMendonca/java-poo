public class Conta {
    // Encapsulamento: somente a própria classe consegue acessar o atributo private
    // para outras classes terem acesso, é necessário criar métodos na classe para suprir
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    // pertence a classe e não a instância do objeto
    private static int total;

    // construtor padrão
    public Conta(int agencia, int numero) {
        // pode utilizar Conta.total++
        total++;
        //System.out.println("o total de contas é: " + total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("estou criando uma conta");
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }

        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("numero menor ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("agencia menor ou igual a zero");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
