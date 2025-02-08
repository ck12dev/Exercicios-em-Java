/*Desenvolva um programa que leia o primeiro termo e a razão de uma
PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
a soma entre todos os valores da sequência. */

import java.util.Scanner;

public class ex069 {
    public static void main(String[] args) {

        // objeto pra entradas
        Scanner t = new Scanner(System.in);
        
        // le o termo e a razao da P.A.
        System.out.print("Digite o primeiro termo da P.A.: ");
        int primTermo = t.nextInt();
        System.out.print("Digite a razão da P.A.: ");
        int razao = t.nextInt();
        
        int somaTermos = 0;
        int termoAtual = primTermo;

        t.close();

        System.out.print("Os 10 primeiros termos da P.A.:(");

        // laço pra fazer a P.A.
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.println(termoAtual + ")");
            } else {
                System.out.print(termoAtual + ", ");
            }
            somaTermos += termoAtual;
            termoAtual += razao;
        }

        System.out.println("A soma dos 10 primeiros termos da P.A. é: " + somaTermos);

    }

}
