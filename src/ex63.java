/*Crie um programa usando a estrutura “faça enquanto” que leia vários números.
A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
tela:
a) O somatório entre todos os valores
b) Qual foi o menor valor digitado
c) A média entre todos os valores
d) Quantos valores são pares */

import java.util.Scanner;

public class ex63 {
    
    public static void main(String[] args) {
        
        char resp;
        int menorValor = Integer.MAX_VALUE;
        int somaValores = 0;
        int ehPar = 0;
        int qtdValores = 0;

        //objeto pra entradas
        Scanner t = new Scanner(System.in);

        //laço pra ler os número e verificar opções
        do {
            System.out.print("Digite um valor: ");
            int valor = t.nextInt();
            somaValores += valor;
            qtdValores++;
            if (valor < menorValor) {
                menorValor = valor;
            }
            if (valor % 2 == 0) {
                ehPar++;
            }
            System.out.print("Você quer continuar(S/N)? ");
            resp = t.next().toUpperCase().charAt(0);
        } while (resp == 'S');

        t.close();

        //calcula a media
        float mediaV = somaValores / (float) qtdValores;

        //exibe resultados
        System.out.println("Somatório dos valores: " + somaValores);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Média dos valores: " + String.format("%.1f", mediaV));
        System.out.println("Quantidades de valores pares: " + ehPar);

    }
}
