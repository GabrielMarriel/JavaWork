package TrabalhoJava2;

public class TesteDeConta {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.Inicializacao(33, 1346, "Joao", "10/02/3007", 354872437);
        conta.verificar_saldo();
    }
}
