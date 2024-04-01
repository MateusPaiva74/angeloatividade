public class Conta {
    private long number;
    private double saldo;

    public Conta() {
        System.out.println("Conta zerada");
    }
    public Conta(long numero, double saldo) {
        this.number = number;
        this.saldo = saldo;
    }
    public boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean depositar(double valor) {
        if(valor >= 0) {
            this.saldo = this.saldo + valor;
            return true;
        } else {
            return false;
        }
    }
    public long getNumber() {
        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }
}