/*Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.
 */

import java.util.Scanner;

public class ex016 {

    public static void main(String[] args) {

        //cria um objeto 't' pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //pergunta a quantidade de cigarros por dia e quantos ano fumando
        System.out.print("Quantos cigarros você fuma por dia? ");
        double qtdCigDia = t.nextDouble();
        System.out.print("Há quantos ano você fuma? ");
        double anosFum = t.nextDouble();

        //calcula o tempo fumando em dias
        double tempoFumDia = (double)((qtdCigDia * 10) / 60); //(qtdCigDia * 10min) / 60min
        double tempoFumTotal = ((365 * anosFum) * tempoFumDia) / 24; //((365diasAno * anosFum) * tempoFumDia) / 24horas
        double anosPerdidosFum = tempoFumTotal / 365; //tempoFumTotal / 365 dias
        

        //exibe na tela
        System.out.printf("O tempo de vida perdido fumando é de %.2f dias.%n", tempoFumTotal);
        System.out.printf("Ou então %.2f anos perdidos.", anosPerdidosFum);

        t.close();
        
    }
    
}
