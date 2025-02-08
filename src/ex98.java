/*Crie um programa que tenha uma função SuperSomador(), que vai receber dois
números como parâmetro e depois vai retornar a soma de todos os valores no
intervalo entre os valores recebidos.
Ex:
SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85 */

import java.util.Scanner;

public class ex98 {
    
    public static Integer SuperSomador(int x, int y) {
        int superSoma = 0;
       
        if (x <= y) {
            for (int c = x; c <= y; c++) {
                superSoma += c;
            }
        } else {
            for (int c = x; c >= y; c--) {
                superSoma += c;
            }
        }
        return superSoma;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int vInicial = t.nextInt();
        System.out.print("Digite o valor final: ");
        int vFinal = t.nextInt();

        t.close();

        if (vInicial <= vFinal) {
            for (int c = vInicial; c <= vFinal; c++) {
                System.out.print(c);
                if (c != vFinal) {                    
                    System.out.print(" + ");
                }
            }
        } else {
            for (int c = vInicial; c >= vFinal; c--) {
                System.out.print(c);
                if (c != vFinal) {
                    System.out.print(" + ");
                } 
            }
        }

        System.out.println(" = " + SuperSomador(vInicial, vFinal));

    }
}