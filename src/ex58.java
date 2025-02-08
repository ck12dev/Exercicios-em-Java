/*Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
vai parar quando for digitada a idade 999. No final, mostre quantos alunos
existem na turma e qual é a média de idade do grupo. */

import java.util.Scanner;

public class ex58 {

    public static void main(String[] args) {

        int totalAlunos = 0;
        int soma = 0;
        
        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //le a idade dos alunos e quantos alunos tem na sala até o usuario querer parar
        do {
            System.out.print("Digite a idade do aluno, ou então '999' para parar: ");
            int idade = t.nextInt();
            if (idade == 999) {
                break;
            }
            soma += idade;
            totalAlunos++;
        } while (true);

        t.close();

        //verifica se há alunos registrados
        if (totalAlunos > 0) {
            //calcula media de idade
            float mediaIdade = soma / (float) totalAlunos;

            //exibe resultados
            System.out.println("Total de alunos: " + totalAlunos);
            System.out.println("Média da idade dos alunos: " + String.format("%.1f", mediaIdade));
        } else {
            System.out.println("Nenhum aluno foi registrado.");
        }

    }
    
}
