/*Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
 - O primeiro valor é o maior
 - O segundo valor é o maior
 - Não existe valor maior, os dois são iguais */

import java.util.Scanner;

public class ex026 {

    public static void main(String[] args) {

        //cria um objeto para ler dados de entrada
        Scanner t = new Scanner(System.in);

        //le dois numeros inteiros
        System.out.print("Digite o primeiro número: ");
        int n1 = t.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = t.nextInt();

        //verifica qual dos numeros é maior ou se são iguais
        if (n1 > n2) {
            System.out.println("O primeiro número, " + n1 + ", é MAIOR que o segundo número, " + n2 + ".");
        } else if (n2 > n1) {
            System.out.println("O segundo número, " + n2 + ", é MAIOR que o primeiro número, " + n1 + ".");
        } else {
            System.out.println("Os números " + n1 + " e " + n2 + " são iguais.");
        }

        t.close();
        
    }
    
}
