/*Vamos melhorar o jogo que fizemos no exercício 32. A partir de
agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
tentativas para tentar acertar. */

import java.util.Scanner;

public class ex055 {

    public static void main(String[] args) {

        int c = 1;
        
        //cria objetos pra ler entradas
        Scanner t = new Scanner(System.in);

        //sorteia um número aleatório
        int numSorteado = (int) ((Math.random() * 10) + 1);

        System.out.println("Tente adivinhar o número, entre 1 e 10, sorteado pelo computador. Você tem 4 tentativas.");

        //faz as 4 tentativas
        while (c <= 4) {
            System.out.print("Digite a " + c + "ª tentativa.");
            int tentativa = t.nextInt();
            if (tentativa == numSorteado) {
                System.out.println("Você ACERTOU!");
                break;
            } else {
                int tentativasRestantes = 4 - c;
                if (tentativasRestantes > 0) {
                    System.out.println("Você ERROU! Você tem " + (4 - c) + " tentativas restantes.");
                } else {
                    System.out.println("Você ERROU! Não há mais tentativas.");
                }
            }
            c++;
        }
        t.close();

        System.out.println("O número sorteado pelo computador foi: " + numSorteado);

    }
    
}
