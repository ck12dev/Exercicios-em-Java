/*Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
um vetor. No final, mostre:
a) Qual é a média da turma
b) Quantos alunos estão acima da média da turma
c) Qual foi a maior nota digitada
d) Em que posições a maior nota aparece */

import java.util.Scanner;

public class ex82 {
    public static void main(String[] args) {

        // vetor do tipo float
        float notas[] = new float[10];

        // objeto pra ler entrada
        Scanner t = new Scanner(System.in);

        float somaNotas = 0;
        int alunosAcimaMediaTurma = 0;
        float maiorNota = Float.MIN_VALUE;

        // laço pra ler as notas
        for (int c = 0; c <= notas.length - 1; c++) {
            System.out.print("Digite a nota do " + (c + 1) + "º aluno: ");
            notas[c] = t.nextFloat();
            somaNotas += notas[c];            
            if (notas[c] > maiorNota) {
                maiorNota = notas[c];
            }
        }

        t.close();

        // A
        // calcula media
        float media = somaNotas / notas.length;
        System.out.println("A média da turma é: " + String.format("%.1f", media));

        // B
        for (int c = 0; c <= notas.length - 1; c++) {
            if (notas[c] >= media) {
                alunosAcimaMediaTurma++;
            }
        }
        System.out.println("Alunos acima da média da turma: " + alunosAcimaMediaTurma);

        // C
        System.out.println("A maior nota é: " + maiorNota);

        // D
        System.out.print("A maior nota aparece nas posições: ");
        for (int c = 0; c <= notas.length - 1; c++) {
            if (notas[c] == maiorNota) {
                System.out.print(c + " ");
            }
        }

    }

}
