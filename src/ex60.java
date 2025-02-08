/*Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
a) O nome da pessoa mais velha
b) O nome da mulher mais jovem
c) A média de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos */

import java.util.Scanner;

public class ex60 {

    public static void main(String[] args) {

        String nomeMaisVelho = "";
        int pessoaMaisVelha = Integer.MIN_VALUE;
        int mulherMaisJovem = Integer.MAX_VALUE;
        String nomeMulherMaisJovem = "";
        int somaIdade = 0;
        int homMais30Anos = 0;
        int mulherMenor18 = 0;
        int totalPessoas = 0;

        // objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        // laço pra verificar se quer cadastrar
        do {
            System.out.print("Você quer cadastrar uma pessoa(S/N)? ");
            char resp = t.next().charAt(0);
            // se resposta for nao interrompe o loop
            if (resp == 'n' || resp == 'N') {
                break;
            }

            t.nextLine();
            // se sim pergunta nome e idade
            System.out.print("Digite o nome da pessoa: ");
            String nome = t.nextLine();
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = t.nextInt();

            // soma a idade pra questao C
            somaIdade += idade;

            // pergunta o sexo e verificar as opçoes
            while (true) {
                System.out.print("Digite o sexo de " + nome + ". [1] -- Homem  [2] -- Mulher: ");
                int sexo = t.nextInt();

                // se resposta valida faz
                if (sexo == 1 || sexo == 2) {

                    // verifica nome pra questão A
                    if (idade > pessoaMaisVelha) {
                        nomeMaisVelho = nome;
                    } else if (idade == pessoaMaisVelha) {
                        nomeMaisVelho += ", " + nome;
                    }

                    // verifica nome pra questão B
                    if (sexo == 2) {
                        if (idade < mulherMaisJovem) {
                            nomeMulherMaisJovem = nome;
                        } else if (idade == mulherMaisJovem) {
                            nomeMulherMaisJovem += ", " + nome;
                        }

                        //verifica contagem pra questão E
                        if (idade < 18) {
                            mulherMenor18++;
                        }
                    }

                    // verifica a contagem pra questão D
                    if (sexo == 1 && idade > 30) {
                        homMais30Anos++;
                    }

                    //interrompe o laço
                    break;

                    //se nao for valida exibe msg e volta pro inicio
                } else {
                    System.out.println("Opção inválida.");
                }

            }

            //conta pessoas
            totalPessoas++;
        } while (true);

        t.close();

        //verifica se alguma pessoa foi cadastrada
        if (totalPessoas > 0) {
            //A
            System.out.println("Nome da pessoa mais velha: " + nomeMaisVelho);
            
            //B
            if (nomeMulherMaisJovem != "") {
                System.out.println("Nome(s) da(s) mulher(es) mais jovem(ns): " + nomeMulherMaisJovem);
            } else {
                System.out.println("Nenhuma mulher cadastrada.");
            }

            //C
            // calcula media de idade do grupo
            float mediaIdade = somaIdade / (float) totalPessoas;
            System.out.println("Média de idade do grupo: " + String.format("%.1f", mediaIdade));

            //D
            if (homMais30Anos != 0) {
                System.out.println("Quantidade de homens acima dos 30 anos: " + homMais30Anos);
            } else {
                System.out.println("Nenhum homem acima dos 30 anos.");
            }

            //E
            if (mulherMenor18 != 0) {
                System.out.println("Quantidade de mulheres abaixo dos 18 anos: " + mulherMenor18);
            } else {
                System.out.println("Nenhuma mulher abaixo dos 18 anos.");
            }
            
        } else {
            System.out.println("Nenhuma pessoa cadastrada.");
        }


    }

}
