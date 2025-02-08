/*Um programa de vida saudável quer dar pontos atividades físicas que podem
ser trocados por dinheiro. O sistema funciona assim:
 - Cada hora de atividade física no mês vale pontos
 - até 10h de atividade no mês: ganha 2 pontos por hora
 - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
 - acima de 20h de atividade no mês: ganha 10 pontos por hora
 - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)  */

import java.util.Scanner;

public class ex36 {

    //metodo retorna vazio, e mostra quanto ira receber
    static void valorGanho (int totalPontos) {
        double valGan = totalPontos * 0.05;
        System.out.println("Você irá receber R$" + valGan);
    }

    //metodo pra somar total de pontos
    static int calcularPontos (int h) {
        int pontos;
        //verifica total de pontos
        if (h < 10) {
            pontos = 2;                        
        } else if (h <= 20) {
            pontos = 5;
        } else {
            pontos = 10;
        }        
        return pontos * h;
    }

    public static void main(String[] args) {        

        //cria um objeto pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //le horas de atividades fisicas no mes
        System.out.print("Quantas horas você praticou atividades físicas este mês? ");
        int h = t.nextInt();

        //soma total de pontos
        int totalPontos = calcularPontos(h);
        
        //mostra quantos reais ira ganhar
        valorGanho(totalPontos);

        t.close();
    }
    
}
