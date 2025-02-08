/* Escreva um programa que leia um número qualquer e mostre a tabuada desse
número, usando a estrutura “para”.
Ex: Digite um valor: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15 ... */

import java.util.Scanner;

public class ex066 {

    public static void main(String[] args) {
        
        //objeto pra entradas
        Scanner t = new Scanner(System.in);

        //le o numero pra realizar a tabuada
        System.out.print("Digite o número pra realizar a tabuada: ");
        int num = t.nextInt();

        t.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
    
}