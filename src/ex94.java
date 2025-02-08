/*Desenvolva um aplicativo que tenha um procedimento chamado
Fibonacci() que recebe um único valor inteiro como parâmetro, indicando quantos
termos da sequência serão mostrados na tela. O seu procedimento deve receber
esse valor e mostrar a quantidade de elementos solicitados.
Obs: Use os exercícios 70 e 75 para te ajudar na solução
Ex:
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM */

import java.util.Scanner;

public class ex94 {

    static void Fibonacci(int x) {
        int primeiroTermo = 1;
        int segundoTermo = 1;
        
        for (int c = 1; c <= x; c++) {
            System.out.print(primeiroTermo + " >> ");
            int somaTermos = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = somaTermos;
        }
        System.out.print("FIM!");
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Digite quantos termos a sequência de Fibonacci terá: ");
        int seq = t.nextInt();

        t.close();

        Fibonacci(seq);
    }

}
