/*Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
 - Homens ganham 5% de desconto
 - Mulheres ganham 13% de desconto */

import java.util.Scanner;

public class ex23 {

    public static void main(String[] args) {
        
        double valorTotDesc;

        //cria objeto pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //le o nome, sexo e valor das compras
        System.out.print("Digite o nome do cliente: ");
        String nome = t.nextLine();
        System.out.print("Digite o sexo do cliente(M/F): ");
        char sexo = t.next().charAt(0);
        System.out.print("Digite o valor das compras(R$): ");
        double valor = t.nextDouble();

        //verifica se é M ou F
        if (sexo == 'F' || sexo == 'f') {
            valorTotDesc = valor - (valor * 0.13);
            System.out.printf("A cliente %s terá que pagar R$%.2f após o desconto.", nome, valorTotDesc);
        } else if (sexo == 'M' || sexo == 'm'){
            valorTotDesc = valor - (valor * 0.05);
            System.out.printf("O cliente %s terá que pagar R$%.2f após o desconto.", nome, valorTotDesc);
        }

        t.close();

    }
    
}
