/*Refaça o exercício 90, só que agora em forma de função Somador(), que vai
receber dois parâmetros e vai retornar o resultado da soma entre eles para o
programa principal. */

import java.util.Scanner;

public class ex95 {
    public static Integer Somador(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int v1 = t.nextInt();
        System.out.print("Digite o segundo valor: ");
        int v2 = t.nextInt();

        t.close();

        System.out.println("A soma dos valores é: " + Somador(v1, v2));

    }
    
}
