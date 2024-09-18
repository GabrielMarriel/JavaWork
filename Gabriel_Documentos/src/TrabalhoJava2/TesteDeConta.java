package TrabalhoJava2;

public class TesteDeConta {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        
        conta.Inicializacao();
        conta.Sacar();
        conta.verificar_saldo();
        conta.transferir();
        conta.cancelarConta();
    }
}
