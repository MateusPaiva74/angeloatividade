public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial() {
        super();
    }
    public ContaEspecial(double saldo, long number, double limite){
        super(number, number);
        this.setLimite(limite);
    }
    public boolean sacar(double valor){
    if (getSaldo() >= valor) {
        double novoSaldo = getSaldo() - (valor * 0.99);
        setSaldo(novoSaldo);
        return true;
    }else{
        return false;
    }
    }
    public double getLimite(){
    	return limite;
}

    public void setLimite(double limite) {
        this.limite = limite;
    }

}