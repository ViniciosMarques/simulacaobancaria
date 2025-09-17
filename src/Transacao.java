import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
    private final String tipo;
    private final double valor;
    private final String data;

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    @Override
    public String toString() {
        return data + " - " + tipo + ": R$ " + valor;
    }
}
