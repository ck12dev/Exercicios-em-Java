/*Crie um jogo de JoKenPo (Pedra-Papel-Tesoura) */

import java.util.Scanner;

public class ex031 {

    static String escolha (int jogada) {
        System.out.print("Jogador 1, digite a sua jogada: ");
        switch (jogada) {
            case 1:
                return "PEDRA";
            case 2:
                return "PAPEL";
            case 3:
                return "TESOURA";
            default:                
                return "Inválido";
        }
    }

    public static void main(String[] args) {
        
        //cria um objeto pra ler entrada de dados
        Scanner t = new Scanner(System.in);
        /*----------------OPÇAO   1--------------------- */
        /*
        System.out.println("PEDRA, PAPEL OU TESOURA");
        System.out.println("Escolha a sua jogada:\n" + 
                            "[1] - PEDRA;\n" +
                            "[2] - PAPEL;\n" +
                            "[3] - TESOURA");

        //le as jogadas
        System.out.print("Jogador 1, digite a sua jogada: ");
        int jogad1 = t.nextInt();        
        System.out.print("Jogador 2, digite a sua jogada: ");
        int jogad2 = t.nextInt();

        

        //verifica as jogadas e quem venceu
        if ((jogad1 == 1 && jogad2 == 3) || (jogad1 == 2 && jogad2 == 1) || (jogad1 == 3 && jogad2 == 2)) {
            System.out.println("Jogador 1 VENCEU!");
        } else if ((jogad1 == 1 && jogad2 == 2) || (jogad1 == 2 && jogad2 == 3) || (jogad1 == 3 && jogad2 == 1)) {
            System.out.println("Jogador 2 VENCEU!");
        } else {
            System.out.println("EMPATE!");
        }

        t.close();
*/
        /*----------------OPÇAO   2--------------------- */

        System.out.println("PEDRA, PAPEL OU TESOURA");
        System.out.println("Escolha a sua jogada:\n" + 
                            "[1] - PEDRA;\n" +
                            "[2] - PAPEL;\n" +
                            "[3] - TESOURA");

        //le as jogadas
        System.out.print("Jogador 1, digite a sua jogada: ");
        int jogadaJogador = t.nextInt();
        int jogadaComputador = (int) ((Math.random() * 3) + 1);

        System.out.println("O jogador escolheu: " + escolha(jogadaJogador));
        System.out.println("O computador escolheu: " + escolha(jogadaComputador));

        if (jogadaJogador == jogadaComputador) {
            System.out.println("EMPATE!");
        } else if ((jogadaJogador == 1 && jogadaComputador == 3) ||
                   (jogadaJogador == 2 && jogadaComputador == 1) ||
                   (jogadaJogador == 3 && jogadaComputador == 2)) {
                    System.out.println("Jogador VENCEU!");
        } else {
            System.out.println("Computador VENCEU!");
        }

        t.close();
        
    }
    
}
