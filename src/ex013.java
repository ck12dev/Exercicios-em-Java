/*Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento. */

import java.util.Scanner;

public class ex013 {

    public static void main(String[] args) {
        
        //cria um objeto 't' pra ler os dados de entrada
        Scanner t = new Scanner(System.in);

        //pergunta e le o salario atual do funcionario
        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salAt = t.nextDouble();

        //calcula o novo salario
        double novoSal = salAt + (salAt * 0.15);

        //mostra o novo salario do funcionario
        System.out.printf("O novo salário do funcionário é de R$ %.2f", novoSal);

        t.close();

    }
    
}