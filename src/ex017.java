/*Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida. */

import java.util.Scanner;

public class ex017 {

    public static void main(String[] args) {
       
        //cria objeto 't' pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //pergunta a velocidade do carro
        System.out.print("Qual a velocidade do carro?(Km/h) ");
        int km = t.nextInt();

        //cria condição pra ver se o carro vai ser multado
        if (km > 80) {
            //faz os calculos de quanto acima do limite e o valor da multa
            int velAcima = km - 80;
            double multa = 5 * velAcima;
            System.out.println("Carro Multado! A multa será de R$ " + multa); //exibe na tela
        } else {
            System.out.println("Carro na velocidade correta."); //senao exibe na tela
        }

        t.close();

    }
    
}
