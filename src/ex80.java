/* Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e
15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
número (chave) e seu programa deve mostrar em que posições essa chave foi
encontrada. Mostre também quantas vezes a chave foi sorteada. */

import java.util.Random;
import java.util.Scanner;

public class ex80 {
    
    public static void main(String[] args) {        
        
        //cria vetor do tipo inteiro
        int numeros[] = new int[30];
        
        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);
        
        //objeto pra gerar numeros aleatorios
        Random aleatorio = new Random();
        
        //laço pra colocar os numeros gerados no vetor
        for (int c = 0; c < numeros.length; c++) {
            numeros[c] = aleatorio.nextInt(15) + 1;
        }
                
        int num;
        //le o numero inserido pelo usuario
        while (true) {
            System.out.print("Digite um número entre 1 e 15: ");
            num = t.nextInt();
            if (num >= 1 && num <= 15) {
                break;
            } else {
                System.out.println("Número inválido.");
            }
        }
                
        boolean numExisteVetor = false;
        int vezesEncontrado = 0;
        System.out.print("Os números foram encontrados dentro do vetor nas posições: ");
        //laço para verificar se o numero digitado existe no vetor
        for (int c = 0; c < numeros.length; c++) {
            if (num == numeros[c]) {
                System.out.print(c + " ");
                vezesEncontrado++;
                numExisteVetor = true;
            }
        }
        
        //verifica se encontrou o numero inserido no vetor
        if (numExisteVetor) {
            System.out.println("\nO número foi encontrado no vetor " + vezesEncontrado + " vezes.");
        } else {
            System.out.println("O número não foi encontrado.");
        }

        t.close();
        
    }
    
}
