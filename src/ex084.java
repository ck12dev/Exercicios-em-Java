/* Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
valores em dois vetores, em posições relacionadas. No final, mostre uma listagem
contendo apenas os dados das pessoas menores de idade. */

import java.util.Scanner;

public class ex084 {
    public static void main(String[] args) {
        
        //cria vetores
        String nomes[] = new String[9];
        int idades[] = new int[9];

        //objeto pra entradas
        Scanner t = new Scanner(System.in);

        //laço pra ler as entradas e armazenas nos vetores especificos
        for (int c = 0; c <= nomes.length - 1; c++) {
            System.out.print("Digite o nome da " + (c + 1) + "ª pessoa: ");
            nomes[c] = t.nextLine();
            System.out.print("Digite a idade da " + (c + 1) + "ª pessoa: ");
            idades[c] = t.nextInt();
            t.nextLine();
        }

        t.close();

        //mostra os vetores juntos
        System.out.println("Pessoas menores de idade:");
        System.out.printf("%-30s %-5s %n", "Nomes", "Idades");
        for (int c = 0; c <= nomes.length - 1; c++) {
            if (idades[c] < 18) {
                System.out.printf("%-30s %-5d%n", nomes[c], idades[c]);
            }
        }

    }
    
}
