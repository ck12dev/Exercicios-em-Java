/*Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
valores para um procedimento Maior() que vai verificar qual deles é o maior e
mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem
informando essa característica. */

import java.util.Scanner;

public class ex091 {
    static void Maior(int x, int y) {
        if (x == y) {
            System.out.println("Os valores são iguais.");
        } else if (x > y) {
            System.out.println("O primeiro valor é maior.");
        } else {
            System.out.println("O segundo valor é maior.");
        }
    }
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int v1 = t.nextInt();
        System.out.print("Digite o segundo valor: ");
        int v2 = t.nextInt();

        t.close();

        Maior(v1, v2);

    }
    
}
