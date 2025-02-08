/*Refaça o exercício 91, só que agora em forma de função Maior(), mas faça uma
adaptação que vai receber TRÊS números como parâmetro e vai retornar qual foi o
maior entre eles. */

import java.util.Scanner;

public class ex97 {
    public static Integer Maior(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int v1 = t.nextInt();
        System.out.print("Digite o segundo valor: ");
        int v2 = t.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int v3 = t.nextInt();

        t.close();

        if (v1 == v2 && v1 == v3) {
            System.out.println("Os 3 valores são iguais.");
        } else {
            System.out.println("O maior valor é: " + Maior(v1, v2, v3));
        }
    }
    
}
