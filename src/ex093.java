/*Faça um programa que tenha um procedimento chamado Contador() que recebe
três valores como parâmetro: o início, o fim e o incremento de uma contagem. O
programa principal deve solicitar a digitação desses valores e passá-los ao
procedimento, que vai mostrar a contagem na tela. 
Para os valores de início (4), fim (20) e incremento(3) teremos
Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM*/

import java.util.Scanner;

public class ex093 {
    static void Contador(int x, int y, int z) {
        if (x > y) {
            for (int c = x; c >= y; c -= z) {
                System.out.print(c + " ");
            }
        } else if (x < y) {
            for (int c = x; c <= y; c += z) {
                System.out.print(c + " ");
            }
        } else {
            System.out.print(x);
        }
    }
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int vInicial = t.nextInt();
        System.out.print("Digite o valor final: ");
        int vFinal = t.nextInt();
        System.out.print("Digite o valor de incremento: ");
        int vIncrem = t.nextInt();

        t.close();

        Contador(vInicial, vFinal, vIncrem);
    }
    
}
