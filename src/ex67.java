/*Faça um programa usando a estrutura “para” que leia um número inteiro
positivo e mostre na tela uma contagem de 0 até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM! */

import java.util.Scanner;

public class ex67 {

    public static void main(String[] args) {

        int num;
        
        //objeto pra entradas
        Scanner t = new Scanner(System.in);

        //laço pra ler numero
        while (true) {
            System.out.print("Digite um número positivo: ");
            num = t.nextInt();
            if (num >= 0) {
                break;
            } else {
                System.out.println("Número inválido.");
            }
        }

        t.close();

        //laço pra contagem
        for (int i = 0; i <= num; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("FIM!");
    }
    
}
