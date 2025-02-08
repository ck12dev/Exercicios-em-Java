/*Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir:
 - Até 3 anos de empresa: aumento de 3%
 - entre 3 e 10 anos: aumento de 12.5%
 - 10 anos ou mais: aumento de 20% */

import java.util.Scanner;

public class ex029 {

    public static void main(String[] args) {

        double novoSal;
        
        //cria um objeto pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //le o nome, salario e anos na empresa
        System.out.print("Digite o nome do funcionário: ");
        String nome = t.nextLine();
        System.out.print("Digite o salário do funcionário (R$): ");
        double sal = t.nextDouble();
        System.out.print("Digite quantos anos o funcionário trabalha na empresa: ");
        int anos = t.nextInt();

        System.out.println("Funcionário: " + nome + 
                        "\nSalário atual: R$" + sal + 
                        "\nAnos trabalhando: " + anos);

        //verifica o aumento do salario
        if (anos < 3) {
            novoSal = sal + (sal * 0.03);
            System.out.printf("O novo salário após reajuste será de R$%.2f", novoSal);
        } else if (anos < 10) {
            novoSal = sal + (sal * 0.125);
            System.out.printf("O novo salário após reajuste será de R$%.2f", novoSal);
        } else {
            novoSal = sal + (sal * 0.2);
            System.out.printf("O novo salário após reajuste será de R$%.2f", novoSal);
        }

        t.close();

    }
    
}
