/*Crie uma lógica que preencha um vetor de 20 posições com números
aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os
números gerados e depois coloque o vetor em ordem crescente, mostrando no final
os valores ordenados. */

import java.util.Arrays;
import java.util.Random;

public class ex083 {

    public static void main(String[] args) {
        
        //vetor do tipo int
        int numeros[] = new int[20];

        //objeto pra criar numeros aleatorios
        Random aleatorio = new Random();

        //laço pra gerar numeros aleatorios no vetor
        for (int c = 0; c <= numeros.length - 1; c++) {
            numeros[c] = aleatorio.nextInt(100);
        }

        System.out.print("Números gerados: ");
        //laço pra mostrar os numeros no vetor
        for (int c = 0; c <= numeros.length - 1; c++) {
            System.out.print(numeros[c] + " ");
        }

        System.out.println();
        //ordena o vetor em ordem crescente
        Arrays.sort(numeros);
        //mostra o vetor ordenado
        System.out.print("Números do vetor ordenados: ");
        for (int num: numeros) {
            System.out.print(num + " ");
        }

    }
    
}
