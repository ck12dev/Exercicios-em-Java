/*Escreva um programa que leia 15 números e guarde-os em um vetor. No final,
mostre o vetor inteiro na tela e em seguida mostre em que posições foram
digitados valores que são múltiplos de 10. */

import java.util.Scanner;

public class ex078 {
    public static void main(String[] args) {

        // vetor pra ler numeros inteiros
        int numeros[] = new int[15];

        // objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        for (int c = 0; c < numeros.length; c++) {
            System.out.print("Digite o " + (c + 1) + "º número: ");
            int num = t.nextInt();
            numeros[c] = num;
        }

        t.close();

        System.out.print("Números do vetor: ");
        // vetor pra mostrar os números do vetor
        for (int c = 0; c < numeros.length; c++) {            
            System.out.print(numeros[c] + " ");            
        }

        System.out.print("\nPosições no vetor em que os números são multiplos de 10: ");
        //cria atributo logico pra ver se tem número que é multiplo de 10
        boolean temMultiploDe10 = false;
        //mostra em que posições os números são multiplos de 10
        for (int c = 0; c < numeros.length; c++) {
            if (numeros[c] % 10 == 0) {
                System.out.print(c + " ");
                temMultiploDe10 = true;
            }
        }

        //se não houver numeros multiplos de 10
        if (!temMultiploDe10) {
            System.out.print("Não há um número múltiplo de 10 no vetor.");
        }

    }

}
