package questao2;

import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dados, dadosDoProfessor;
        dados = new String[]{"Nome:", "Endereço:", "Cidade:", "UF:", "CEP:", "Telefone:", "CPF:", "RG:", "Data de nascimento:", "grau de escolaridade:", "curso que leciona:"};
        dadosDoProfessor = new String[dados.length];

        for (int i = 0; i < dados.length; i++) {
            System.out.print(dados[i]);
            dadosDoProfessor[i] = sc.next();
        }

        for (int i = 0; i < dados.length; i++) {
            System.out.println(dados[i] + " " + dadosDoProfessor[i]);
        }
    }
}
