/*Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou! */

import java.util.Scanner;

public class ex44 {

    public static void main(String[] args) {

        // cria objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        // pergunta e le o numero inicial, final e de incremento
        System.out.print("Digite o número inicial: ");
        int numI = t.nextInt();
        System.out.print("Digite o número final: ");
        int numF = t.nextInt();
        System.out.print("Digite o número de incremento: ");
        int numIncrem = t.nextInt();

        // faz a contagem
        if (numIncrem <= 0) {
            System.out.println("ERRO! O número de incremento deve ser positivo.");
        } else {
            System.out.print("Contagem: ");
            while (numI <= numF) {
                if (numI == numF) {
                    System.out.print(numI + " Acabou!");
                } else {
                    System.out.print(numI + " ");
                }
                numI += numIncrem;
            }
        }

        t.close();

    }

}
