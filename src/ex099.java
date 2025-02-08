/*Faça um programa que possua uma função chamada Potencia(), que vai receber
dois parâmetros numéricos (base e expoente) e vai calcular o resultado da
exponenciação.
Ex: Potencia(5,2) vai calcular 5² = 25  */

import java.util.Scanner;

public class ex099 {

    public static Integer Potencia(int x, int y) {
        return (int) Math.pow(x, y);
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Digite a base da potência: ");
        int base = t.nextInt();
        System.out.print("Digite o expoente da potência: ");
        int expoente = t.nextInt();

        t.close();

        System.out.println("A potência será igual a: " + Potencia(base, expoente));
    }
    
}
