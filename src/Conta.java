import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected String numero;
    protected String titular;
    protected double saldo;
    protected List<Transacao> historico = new ArrayList<>();

    public Conta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("⚠️ Valor inválido para depósito.");
            return;
        }
        saldo += valor;
        historico.add(new Transacao("Depósito", valor));
        System.out.println("✅ Depósito realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            System.out.println("❌ Saldo insuficiente ou valor inválido.");
            return;
        }
        saldo -= valor;
        historico.add(new Transacao("Saque", -valor));
        System.out.println("✅ Saque realizado com sucesso.");
    }

    public void extrato() {
        System.out.println("\n📄 Extrato da conta " + numero + " - Titular: " + titular);
        if (historico.isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            historico.forEach(System.out::println);
        }
        System.out.println("Saldo atual: R$" + saldo + "\n");
    }

    public String getNumero() { return numero; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
}
