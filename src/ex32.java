/*Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
jogador vai tentar descobrir qual foi o valor sorteado. */

import java.util.Scanner;

public class ex32 {

    public static void main(String[] args) {
        
        //cria objeto pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //sorteia um número aleatorio
        int numAle = (int) ((Math.random() * 5) + 1);

        //le qual numero o jogador acha que foi sorteado
        System.out.print("Digite qual o número, entre 1 e 5, o computador sorteou: ");
        int num = t.nextInt();

        if (num == numAle) {
            System.out.println("Você ACERTOU!");
        } else {
            System.out.println("Você ERROU! O computador escolheu: " + numAle);
        }

        t.close();

    }
    
}
