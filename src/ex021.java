/*Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO */

import java.util.Scanner;

public class ex021 {

    public static void main(String[] args) {
        
        //cria um objeto pra ler entrada de dados
        Scanner t = new Scanner(System.in);

        //le um ano
        System.out.print("Digite um ano: ");
        int ano = t.nextInt();

        //verifica se é bissexto
        if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 ==0)) {
            System.out.println("O ano " + ano + " é BISSEXTO!");
        } else {
            System.out.println("O ano " + ano + " não é BISSEXTO!");
        }

        t.close();

    }
    
}
