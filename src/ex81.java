/*Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
final, mostre: 
a) Qual é a média de idade das pessoas cadastradas
b) Em quais posições temos pessoas com mais de 25 anos
c) Qual foi a maior idade digitada (podem haver repetições)
d) Em que posições digitamos a maior idade */

import java.util.Scanner;

public class ex81 {
    public static void main(String[] args) {

        // objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        // vetor pra idades
        int idades[] = new int[8];

        int somaIdades = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int maiorIdadeIgual = 1;

        // le as idades e coloca no vetor
        for (int c = 0; c < idades.length; c++) {
            System.out.print("Digite a idade da " + (c + 1) + "ª pessoa: ");
            idades[c] = t.nextInt();
            somaIdades += idades[c];
            if (idades[c] == maiorIdade) {
                maiorIdadeIgual++;
            } else if (idades[c] > maiorIdade) {
                maiorIdade = idades[c];
                maiorIdadeIgual = 1;
            }
        }

        t.close();

        // calcula a media das idades
        float media = somaIdades / (float) (idades.length + 1);
        // exibe resultados
        // A
        System.out.println("Média das idades das pessoas: " + String.format("%.1f", media));
        // B
        System.out.print("Posições no vetor em que a idade é maior que 25: ");
        boolean idadeMaior25 = false;
        for (int c = 0; c < idades.length; c++) {
            if (idades[c] > 25) {
                System.out.print(c + " ");
                idadeMaior25 = true;
            }
        }
        if (!idadeMaior25) {
            System.out.print("Não há idades maiores que 25.");
        }
        // C
        System.out.println("\nA maior idade digitada foi: " + maiorIdade + " anos. Essa idade foi encontrada "
                + maiorIdadeIgual + " vezes.");
        // D
        if (maiorIdadeIgual > 1) {
            System.out.print("A maior idade foi encotrada nas posições: ");
            for (int c = 0; c < idades.length; c++) {
                if (idades[c] == maiorIdade) {
                    System.out.print(c + " ");
                }
            }
        } else if (maiorIdadeIgual == 1) {
            System.out.print("A maior idade foi encontrada na posição: ");
            for (int c = 0; c < idades.length; c++) {
                if (idades[c] == maiorIdade) {
                    System.out.print(c + " ");
                }
            }
        }

    }

}
