/*Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois. */

import java.util.Scanner;

public class ex25 {
    
    public static void main(String[] args) {
        
        //cria um objeto pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //le o tamanho das retas
        System.out.print("Digite o valor da primeira reta: ");
        int r1 = t.nextInt();
        System.out.print("Digite o valor da segunda reta: ");
        int r2 = t.nextInt();
        System.out.print("Digite o valor da terceira reta: ");
        int r3 = t.nextInt();

        //verifica se as retas formam um triângulo
        if (r1 < r2 + r3 && r2 < r1 + r3 && r3 < r1 + r2) {
            System.out.println("As retas formam um triângulo.");
        } else {
            System.out.println("As retas não formam um triângulo");
        }

        t.close();

    }

}
