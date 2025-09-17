import java.util.Scanner;

public class Menu {
    private RepositorioContas repositorio = new RepositorioContas();
    private Scanner sc = new Scanner(System.in);

    public void exibir() {
        int opcao;
        do {
            System.out.println("\n=== SISTEMA BANCÁRIO ===");
            System.out.println("1 - Criar Conta Corrente");
            System.out.println("2 - Criar Conta Poupança");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Extrato");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> criarContaCorrente();
                case 2 -> criarContaPoupanca();
                case 3 -> depositar();
                case 4 -> sacar();
                case 5 -> extrato();
                case 0 -> System.out.println("👋 Saindo...");
                default -> System.out.println("❌ Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void criarContaCorrente() {
        System.out.print("Número da conta: ");
        String numero = sc.nextLine();
        System.out.print("Titular: ");
        String titular = sc.nextLine();
        System.out.print("Limite: ");
        double limite = sc.nextDouble();
        sc.nextLine();
        repositorio.adicionarConta(new ContaCorrente(numero, titular, limite));
        System.out.println("✅ Conta Corrente criada!");
    }

    private void criarContaPoupanca() {
        System.out.print("Número da conta: ");
        String numero = sc.nextLine();
        System.out.print("Titular: ");
        String titular = sc.nextLine();
        repositorio.adicionarConta(new ContaPoupanca(numero, titular));
        System.out.println("✅ Conta Poupança criada!");
    }

    private void depositar() {
        Conta conta = selecionarConta();
        if (conta == null) return;
        System.out.print("Valor do depósito: ");
        double valor = sc.nextDouble();
        sc.nextLine();
        conta.depositar(valor);
    }

    private void sacar() {
        Conta conta = selecionarConta();
        if (conta == null) return;
        System.out.print("Valor do saque: ");
        double valor = sc.nextDouble();
        sc.nextLine();
        conta.sacar(valor);
    }

    private void extrato() {
        Conta conta = selecionarConta();
        if (conta == null) return;
        conta.extrato();
    }

    private Conta selecionarConta() {
        System.out.print("Número da conta: ");
        String numero = sc.nextLine();
        Conta conta = repositorio.buscarConta(numero);
        if (conta == null) System.out.println("❌ Conta não encontrada!");
        return conta;
    }
}
