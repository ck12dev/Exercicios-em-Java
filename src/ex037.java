/*Uma empresa precisa reajustar o salário dos seus funcionários, dando um
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
 - menos de 15 anos de empresa: +5%
 - de 15 até 20 anos de empresa: +12%
 - mais de 20 anos de empresa: +23%
- Homens
 - menos de 20 anos de empresa: +3%
 - de 20 até 30 anos de empresa: +13%
 - mais de 30 anos de empresa: +25% */

import java.util.Scanner;

public class ex037 {

    public static void main(String[] args) {
        
        double novoSal;

        //cria objeto pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //le os dados
        System.out.print("Digite o gênero do funcionário\n" +
                            "[1] - feminino\n" +
                            "[2] - masculino: ");
        int gen = t.nextInt();
        System.out.print("Digite o salário atual do funcionário: ");
        double sal = t.nextDouble();
        System.out.print("Digite há quantos anos o funcionário trabalha: ");
        int anos = t.nextInt();

        //verifica o genero e faz os calculos
        switch (gen) {
            case 1: 
                if (anos < 15) {
                    novoSal = sal * 1.05;
                } else if (anos < 20) {
                    novoSal = sal * 1.12;
                } else {
                    novoSal = sal * 1.23;
                }
                break;
            case 2:
                if (anos < 20) {
                    novoSal = sal * 1.03;
                } else if (anos < 30) {
                    novoSal = sal * 1.13;
                } else {
                    novoSal = sal * 1.25;
                }       
                break;                       
            default:
                System.out.println("Opção inválida.");
                t.close();
                return;
        }

        System.out.println("O novo salário do funcionário pós reajuste será de R$" + String.format("%.2f", novoSal));

        t.close();

    }
    
}
