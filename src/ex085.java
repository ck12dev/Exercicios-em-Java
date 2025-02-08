/*Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
guarde esses dados em três vetores. No final, mostre uma listagem contendo
apenas os dados das funcionárias mulheres que ganham mais de R$5 mil. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex085 {
    public static void main(String[] args) {
        
        //cria vetores
        String nomes[] = new String[5];
        char sexo[] = new char[5];
        double salario[] = new double[5];

        //objeto pra numero decimal formatado
        DecimalFormat df = new DecimalFormat("#,###.00");

        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //laço pra perguntar e ler os dados
        for (int c = 0; c <= nomes.length - 1; c++) {
            System.out.print("Digite o nome da " + (c + 1) + "ª pessoa: ");
            nomes[c] = t.nextLine();
            System.out.print("Digite o sexo da " + (c + 1) + "ª pessoa(M/F): ");
            sexo[c] = t.next().toUpperCase().charAt(0);
            System.out.print("Digite o salário da " + (c + 1) + "ª pessoa: R$");
            salario[c] = t.nextDouble();
            t.nextLine();
        }
        t.close();

        System.out.println("Mulheres que ganham mais de R$5.000,00:");
        System.out.printf("%-25s %-5s %-10s %n", "Nome", "Sexo", "Salário");
        //mostra os dados
        for (int c = 0; c <= nomes.length - 1; c++) {
            if (sexo[c] == 'F' && salario[c] >= 5000) {
                System.out.printf("%-25s %-10c %-10s %n", nomes[c], sexo[c], df.format(salario[c]));
            }
        }

    }
    
}
