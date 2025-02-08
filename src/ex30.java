/*Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
de triângulo será formado:
 - EQUILÁTERO: todos os lados iguais
 - ISÓSCELES: dois lados iguais
 - ESCALENO: todos os lados diferentes
 */

import java.util.Scanner;

public class ex30 {

    public static void main(String[] args) {
        
        //cria um objeto pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //le as retas
        System.out.print("Digite o valor da primeira reta: ");
        int r1 = t.nextInt();
        System.out.print("Digite o valor da segunda reta: ");
        int r2 = t.nextInt();
        System.out.print("Digite o valor da terceira reta: ");
        int r3 = t.nextInt();

        //verifica se é um triangulo
        if (r1 < r2 + r3 && r2 < r1 + r3 && r3 < r1 + r2) {
            System.out.println("É um triângulo.");
            //verifica o tipo do triangulo
            if (r1 == r2 && r2 == r3) {
                System.out.println("Triângulo EQUILÁTERO.");
            } else if (r1 != r2 && r2 != r3) {
                System.out.println("Triângulo ESCALENO.");
            } else {
                System.out.println("Triângulo ISÓSCELES.");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }

        t.close();
        
    }
    
}
