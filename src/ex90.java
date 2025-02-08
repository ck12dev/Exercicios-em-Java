/*Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
valores para um procedimento Somador() que vai calcular e mostrar a soma entre
eles. */

import java.util.Scanner;

public class ex90 {

    static void Somador(int x, int y) {
        int soma = x + y;
        System.out.println("O resultado da soma " + x + " + " + y + " = " + soma);
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int v1 = t.nextInt();
        System.out.print("Digite o segundo valor: ");
        int v2 = t.nextInt();

        t.close();

        Somador(v1, v2);

    }
    
}
