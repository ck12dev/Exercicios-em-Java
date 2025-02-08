/*Faça um programa que leia 7 números inteiros e no final mostre o somatório
entre eles. */

import java.util.Scanner;

public class ex48 {

    public static void main(String[] args) {
        
        int c = 1;
        int sm = 0;
        
        //objeto pra montar Strings
        StringBuilder soma = new StringBuilder();

        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //le e soma as entradas
        while (c <= 7) {
            System.out.print("Digite o " + c + "º valor: ");
            int num = t.nextInt();
            if (c == 7) {
                soma.append(num); 
            } else {
                soma.append(num).append(" + ");
            }
            sm += num;
            c++;
        }

        t.close();

        System.out.println("A soma dos valores " + soma + " = " + sm);

    }
    
}
