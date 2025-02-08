/*Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
a) qual é a maior idade lida
b) quantos homens foram cadastrados
c) qual é a idade da mulher mais jovem
d) qual é a média de idade entre os homens */

import java.util.Scanner;

public class ex059 {

    public static void main(String[] args) {

        int sexo;
        int maiorIdade = Integer.MIN_VALUE;
        int totalHom = 0;
        int somaIdadeHom = 0;
        int idadeMulMaisJovem = Integer.MAX_VALUE;

        // objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        // le os dados e verifica as opçoes
        do {
            System.out.print("Você quer cadastrar uma pessoa(S/N)? ");
            char resp = t.next().charAt(0);
            if (resp == 'n' || resp == 'N') {
                break;
            }
            while (true) {
                System.out.print("Digite o sexo da pessoa:\n [1] -- Homem [2] -- Mulher: ");
                sexo = t.nextInt();
                if (sexo == 1 || sexo == 2) {
                    System.out.print("Digite a idade da pessoa: ");
                    int idade = t.nextInt();
                    if (sexo == 1) {
                        somaIdadeHom += idade;
                        totalHom++;
                    } else if (sexo == 2) {
                        if (idade < idadeMulMaisJovem || idadeMulMaisJovem == 0) {
                            idadeMulMaisJovem = idade;
                        }
                    }
                    if (idade > maiorIdade) {
                        maiorIdade = idade;
                    }
                    break;
                } else {
                    System.out.println("Opção inválida.");
                }
            }
        } while (true);

        t.close();

        // exibe resultados
        if (maiorIdade != Integer.MIN_VALUE) {
            System.out.println("Maior idade registrada: " + maiorIdade);
            if (totalHom != 0) {
                // calcula media idade homem
                float mediaIdadeHom = somaIdadeHom / (float) totalHom;
                System.out.println("Homens cadastrados: " + totalHom);
                System.out.println("Média de idade dos homens: " + String.format("%.1f", mediaIdadeHom));
            } else {
                System.out.println("Nenhum homem cadastrado.");
            }
            if (idadeMulMaisJovem != Integer.MAX_VALUE) {
                System.out.println("Idade da mulher mais jovem: " + idadeMulMaisJovem);
            } else {
                System.out.println("Nenhuma mulher cadastrada.");
            }
        } else {
            System.out.print("Nenhuma pessoa registrada.");
        }

    }

}
