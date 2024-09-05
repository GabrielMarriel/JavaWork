package questao1;

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = 1, y = 1, cow;
        x = sc.nextFloat();
        y = sc.nextFloat();
        cow = x * y;
        System.out.println(cow);
    }
}
