public class Conta {
    // Encapsulamento: somente a própria classe consegue acessar o atributo private
    // para outras classes terem acesso, é necessário criar métodos na classe para suprir
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

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
}
