/*Crie uma lógica que leia um número inteiro e passe para um procedimento
ParOuImpar() que vai verificar e mostrar na tela se o valor passado como
parâmetro é PAR ou ÍMPAR. */

import java.util.Scanner;

public class ex92 {

    static void ParOuImpar(int x) {
        if (x % 2 == 0) {
            System.out.println("O número " + x + " é PAR.");
        } else {
            System.out.println("O número " + x + " é ÍMPAR.");
        }
    }
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in); 

        System.out.print("Digite um número: ");
        int num = t.nextInt();

        t.close();

        ParOuImpar(num);
    }
    
}
