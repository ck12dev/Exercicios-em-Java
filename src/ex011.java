/*Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta. */

import java.util.Scanner;

public class ex011 {

    public static void main(String[] args) {
        
        //cria um objeto 't' para ler os dados de entrada
        Scanner t = new Scanner(System.in);

        //pede e lê os valores ao usuario
        System.out.print("Digite o primeiro valor: ");
        double a = t.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double b = t.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        double c = t.nextDouble();

        //faz o calculo de delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        //exibe o resultado de delta
        System.out.printf("O valor de delta é %.2f", delta);

        //fecha o scanner
        t.close();

    }
    
}
