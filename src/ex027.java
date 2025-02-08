/* Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
 - Média até 4.9: REPROVADO
 - Média entre 5.0 e 6.9: RECUPERAÇÃO
 - Média 7.0 ou superior: APROVADO
 */

import java.util.Scanner;

public class ex027 {

    public static void main(String[] args) {
        
        //cria um objeto pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //le as notas do aluno
        System.out.print("Digite a primeira nota do aluno: ");
        float n1 = t.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        float n2 = t.nextFloat();

        //calcula a media das notas
        float media = (n1 + n2) / 2;

        System.out.println("Média do aluno: " + media);

        //verifica a situação do aluno
        if (media < 5) {
            System.out.println("ALUNO REPROVADO");
        } else if (media < 7) {            
            System.out.println("ALUNO EM RECUPERAÇÃO");
        } else {
            System.out.println("ALUNO APROVADO");
        }

        t.close();

    }
    
}
