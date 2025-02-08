/*Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo
b) Quantas pessoas tem mais de 18 anos
c) Quantas pessoas tem menos de 5 anos
d) Qual foi a maior idade lida */

import java.util.Scanner;

public class ex052 {

    public static void main(String[] args) {

        int c = 1;
        int soma = 0;
        int maior18Anos = 0;
        int menor5Anos = 0;
        int maiorIdade = 0;
        int totalPessoas = 0;
        
        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //le as idades e verifica as opçoes
        while (c <= 10) {
            System.out.print("Digite a " + c + "ª idade: ");
            int idade = t.nextInt();
            soma += idade;
            if (idade >= 18) {
                maior18Anos++;
            }
            if (idade <= 5) {
                menor5Anos++;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            totalPessoas++;
            c++;
        }

        t.close();

        //calcula media
        float media = soma / (float) totalPessoas;

        //mostra os resultados
        System.out.println("Média de idade: " + String.format("%.1f", media));
        System.out.println("Maior de 18 anos: " + maior18Anos);
        System.out.println("Menos que 5 anos: " + menor5Anos);
        System.out.println("Maior idade: " + maiorIdade);


    }
    
}
