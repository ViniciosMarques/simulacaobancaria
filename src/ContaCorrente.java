public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0 || valor > saldo + limite) {
            System.out.println("❌ Saldo e limite insuficientes.");
            return;
        }
        saldo -= valor;
        historico.add(new Transacao("Saque CC", -valor));
        System.out.println("✅ Saque realizado com sucesso na Conta Corrente.");
    }
}
