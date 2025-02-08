/*O programa do exercicio anterior vai ter um problema quando digitarmos o primeiro valor
maior que o último. Resolva esse problema com um código que funcione em qualquer
situação. */

import java.util.Scanner;

public class ex45 {

    public static void main(String[] args) {
        
        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //pergunta e le o numero inicial, final e de incremento
        System.out.print("Digite o número inicial: ");
        int numI = t.nextInt();
        System.out.print("Digite o número final: ");
        int numF = t.nextInt();
        System.out.print("Digite o número de incremento: ");
        int numIncrem = t.nextInt();

        //verifica se o numIncrem é positivo
        if (numIncrem <= 0) {
            System.out.println("ERRO! O incremento deve ser um número positivo.");
        } else {
        //verifica se o numI é maior ou menor que o numF e faz a contagem
            if (numI <= numF) {
                System.out.print("Contagem: ");
                while (numI <= numF) {
                    if (numI == numF) {
                        System.out.print(numI + " Acabou!");
                    } else {
                        System.out.print(numI + " ");
                    }
                    numI += numIncrem;
                }
            } else {
                System.out.print("Contagem: ");
                while (numI >= numF) {
                    if (numI == numF) {
                        System.out.print(numI + " Acabou!");
                    } else {
                        System.out.print(numI + " ");
                    }
                    numI -= numIncrem;
                }
            }
        }

        t.close();
    }
    
}
