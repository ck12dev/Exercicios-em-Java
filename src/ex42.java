/* Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou! */

import java.util.Scanner;

public class ex42 {

    public static void main(String[] args) {
        
        int c = 1;

        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //pergunta e le o numero
        System.out.print("Digite um numero positivo: ");
        int num = t.nextInt();

        //verifica se num maior que 0 e faz a contagem
        if (num > 0) {
            System.out.print("Contagem: ");
            while (c <= num) {
                if (c == num) {
                    System.out.print(c + " Acabou!");
                } else {
                    System.out.print(c + " ");
                }
                c++;
            }
        } else {
            System.out.println("ERRO! Digite um número válido.");
        }

        t.close();

    }
}