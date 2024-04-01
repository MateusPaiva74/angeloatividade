public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta(1, 400);
        Conta conta2 = new Conta(2, 850);

        ContaEspecial contaesp = new ContaEspecial(1, 5500, 9000);
        ContaInvestimento containvest = new ContaInvestimento(1, 1000, 1, 4);

        System.out.println("Número da conta 1: " + conta1.getNumber());
        System.out.println("Saldo 1: " + conta1.getSaldo());
        System.out.println("Número da conta 2: " + conta2.getNumber());
        System.out.println("Saldo 2: " + conta2.getSaldo());

        System.out.println("Prazo da conta investimento: " + containvest.getPrazo());
        System.out.println("Limite da conta especial: " + contaesp.getLimite());

    }

}