/*Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
No final, mostre quais são os números pares que foram digitados e em que
posições eles estão armazenados. */

import java.util.Scanner;

public class ex079 {
    public static void main(String[] args) {

        //vetor de inteiros
        int numeros[] = new int[10];

        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //laço pra colocar numeros no vetor
        for (int c = 0; c < numeros.length; c++) {
            System.out.print("Digite o " + (c + 1) + "º número: ");
            int num = t.nextInt();
            numeros[c] = num;
        }

        t.close();

        System.out.print("Vetor com valores pares destacados por '[]': ");
        //mostra o vetor com numeros pares destacados
        for (int c = 0; c < numeros.length; c++) {
            if (numeros[c] % 2 == 0) {
                System.out.print("[" + numeros[c] + "] ");
            } else {
                System.out.print(numeros[c] + " ");
            }
        }

        System.out.print("\nPosições em que os números pares foram inseridos: ");
        boolean ehPar = false;
        //laço pra mostrar em que posições do vetor há números pares
        for (int c = 0; c < numeros.length; c++) {
            if (numeros[c] % 2 == 0) {
                System.out.print(c + " ");
                ehPar = true;
            }
        } 

        //mostra mensagem se não houver números pares no vetor
        if (!ehPar) {
            System.out.print("Não há números pares.");
        }
        
    }
    
}
