import java.util.HashMap;
import java.util.Map;

public class RepositorioContas {
    private Map<String, Conta> contas = new HashMap<>();

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Conta buscarConta(String numero) {
        return contas.get(numero);
    }
}
