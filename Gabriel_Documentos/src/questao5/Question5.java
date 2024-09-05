package questao5;

import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float nHoras, nDependentes;
        double salario, desconto = 0;
        nome = sc.nextLine();
        nHoras = sc.nextFloat();
        nDependentes = sc.nextFloat();
        sc.close();
        salario = nHoras * 3.00;
        salario += (nDependentes * 100);
        desconto = (13.5 * salario) / 100;
        salario = salario - desconto;
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Líquido: %.2f", salario);
    }
}