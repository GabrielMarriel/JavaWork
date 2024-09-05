package questao3;

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float dolar, valor, real;
        dolar = sc.nextFloat();
        valor = sc.nextFloat();
        real = valor / dolar;
        System.out.printf("%.2f",real);
    }
}
