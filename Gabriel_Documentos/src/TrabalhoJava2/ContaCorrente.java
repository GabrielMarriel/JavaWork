package TrabalhoJava2;

class ContaCorrente{
    int numeroDaConta = 145;
    int numeroDaAgencia = 45736835;
    String nomeDoCliente = "Roberval";
    String dataDeNascimento = "15/09/2002";
    float saldo = 1243546;

    public void Inicializacao(int numeroDaConta, int numeroDaAgencia, String nomeDoCliente, String dataDeNascimento, float saldo){
        this.numeroDaConta = numeroDaConta;
        this.numeroDaAgencia = numeroDaAgencia;
        this.nomeDoCliente = nomeDoCliente;
        this.dataDeNascimento = dataDeNascimento;
        this.saldo = saldo;
    }
    public float Sacar (float quantidade){
        if(quantidade>saldo) {
            System.out.println("Saldo insuficiente");
        }else {
            saldo -= quantidade;
            System.out.println(quantidade + " retirados.");
            return quantidade;
        }
        return quantidade;
    }
    void depositar (float quantidade){
        saldo += quantidade;
        System.out.println(quantidade + " depositados");
    }
    void verificar_saldo (){
        System.out.printf("Seu saldo é de: %.2f", saldo);
    }
    void transferir(ContaCorrente destino, float quantidade) {
        if (quantidade > saldo) {
            System.out.println("Saldo insuficiente para transferência");
        } else {
            this.saldo -= quantidade;
            destino.saldo += quantidade;
            System.out.println(quantidade + " transferidos para a conta " + destino.numeroDaConta);
        }
    }

    void cancelarConta(String justificativa) {
        System.out.println("Conta cancelada. Justificativa: " + justificativa);
        this.numeroDaConta = 0;
        this.numeroDaAgencia = 0;
        this.nomeDoCliente = "";
        this.dataDeNascimento = "";
        this.saldo = 0;
    }
}
