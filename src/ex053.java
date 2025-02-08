/*Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos */

import java.util.Scanner;

public class ex053 {

    public static void main(String[] args) {

        int p = 1;
        int totHomem = 0;
        int totMulher = 0;
        int somaIdadeGrupo = 0;
        int somaIdadeH = 0;
        int mulherAcima20 = 0;
        int totalPessoas = 0;

        // objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        // le o sexo e idade de 5 pessoas e verifica as opções
        while (p <= 5) {
            int sexo;
            while (true) {
                System.out.print("Digite o sexo da " + p + "ª pessoa:\n [1] Homem --- [2] Mulher: ");
                sexo = t.nextInt();
                if (sexo == 1 || sexo == 2) {
                    break;
                }
                System.out.println("Opção inválida.");
            }
            System.out.print("Qual a idade da pessoa: ");
            int idade = t.nextInt();
            if (sexo == 1) {
                somaIdadeH += idade;
                totHomem++;
            } else if (sexo == 2) {
                totMulher++;
                if (idade >= 20) {
                    mulherAcima20++;
                }
            }
            somaIdadeGrupo += idade;
            totalPessoas++;
            p++;
        }
        t.close();

        // calcula media das idades
        float mediaIdadeGrupo = somaIdadeGrupo / (float) (totalPessoas);
        float mediaIdadeHomem = somaIdadeH / (float) totHomem;

        // mostra resultados
        System.out.println("Homens cadastrados: " + totHomem);
        System.out.println("Mulheres cadastradas: " + totMulher);
        System.out.println("Média de idade do grupo: " + String.format("%.1f", mediaIdadeGrupo));
        System.out.println("Média de idade dos homens: " + String.format("%.1f", mediaIdadeHomem));
        System.out.println("Mulheres acima de 20 anos: " + mulherAcima20);

    }

}
