/* Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR. */

import java.util.Scanner;

public class ex20 {

    public static void main(String[] args) {
        
        //cria objeto pra ler entrada de dados
        Scanner t = new Scanner(System.in);

        //pergunta e le um numero
        System.out.print("Digite um número inteiro: ");
        int n = t.nextInt();

        //verifica se o numero é par ou impar
        if (n % 2 == 0) {
            System.out.println("O número: " + n + " é PAR!");
        } else {
            System.out.println("O número: " + n + " é ÍMPAR!");
        }

        t.close();

    }
    
}
    