/*Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0). */

import java.util.Scanner;

public class ex019 {

    public static void main(String[] args) {
        
        //cria objeto 't' pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //pergunta e le o nome e as notas do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = t.nextLine();
        //t.nextLine();
        System.out.print("Digite a primeira nota do aluno: ");
        float n1 = t.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        float n2 = t.nextFloat();

        //calcula a media
        float media = (n1 + n2) / 2;

        //verifica se aluno aprovado ou nao
        if (media >= 7) {
            System.out.println("Média do aluno " + nome + ": " + media + " --- Aluno aprovado!");
        } else {
            System.out.println("Média do aluno " + nome + ": " + media + " --- Aluno reprovado!");
        }

        t.close();

    }
    
}
