// Classe ContaInvestimento
public class ContaInvestimento extends Conta{
    private double taxa;
    private int prazo;

    public ContaInvestimento() {
        super();
    }

    public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
        super(numero, saldo);
        this.taxa = taxa;
        this.setPrazo(prazo);
    }

    public boolean sacar(double valor) {
        if(getSaldo() >= valor) {
            double novoSaldo = getSaldo() - (valor * this.taxa);
            setSaldo(novoSaldo);
            return true;
        } else {
            return false;
        }
    }
    public boolean depositar(double valor) {
        if(valor >= 0) {
            setSaldo(getSaldo() + (valor * this.taxa));
            return true;
        } else {
            return false;
        }
    }
    public void addRendimento(double taxa) {
        setSaldo(getSaldo() + (1 * taxa));
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

}