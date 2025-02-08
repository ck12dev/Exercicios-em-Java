/* Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada. */

import java.util.Scanner;

public class ex015 {

    public static void main(String[] args) {
        
        //cria um objeto 't' pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //pergunta e le os dados
        System.out.print("Digite o número de dias trabalhados no mês: ");
        int dias = t.nextInt();

        //calcula o salario
        double sal = 25 * dias * 8;

        //exibe o salario no final do mes
        System.out.printf("Após trabalhar %d dias o salário do funcionário no final do mês será de R$ %.2f", dias, sal);

        t.close();

    }
    
}
