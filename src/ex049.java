/*Crie um programa que leia 6 números inteiros e no final mostre quantos deles
são pares e quantos são ímpares. */

import java.util.Scanner;

public class ex049 {

    public static void main(String[] args) {

        int c = 1;
        int totPar = 0;
        int totImpar = 0;
        
        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //le os numeros e verifica quantos sao pares ou impares
        while (c <= 6) {
            System.out.print("Digite o " + c + "º valor inteiro: ");
            int num = t.nextInt();
            if (num % 2 == 0) {
                totPar++;
            } else {
                totImpar++;
            }
            c++;
        }

        t.close();

        //mostra a quantidade de pares e impares
        System.out.println("Quantidade de números pares: " + totPar);
        System.out.println("Quantidade de números ímpares: " + totImpar);

    }
    
}
