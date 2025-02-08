/*Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto. */

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        
        //cria um objeto 't' pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //pergunta e le o preço do produto
        System.out.print("Digite o preço do produto: ");
        double preco = t.nextDouble();

        //calcula o valor promocional
        double precoProm = preco - (preco * 0.05);

        //exibe o preço do produto e o preço com o desconto
        System.out.printf("O preço do produto com 5%% de desconto é de %.2f", precoProm);

        t.close();

    }
    
}
