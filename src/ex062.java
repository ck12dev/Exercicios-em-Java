/*Faça um programa usando a estrutura “faça enquanto” que leia a idade de
várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
na tela:
a) Quantas idades foram digitadas
b) Qual é a média entre as idades digitadas
c) Quantas pessoas tem 21 anos ou mais. */

import java.util.Scanner;

public class ex062 {

    public static void main(String[] args) {
        
        int contagemIdades = 0;
        int somaIdades = 0;
        int pessoasComOuAcima21 = 0;
        char resp;

        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //laço pra ler idades ate o usuario parar
        do {
            System.out.print("Digite a idade da pessoa: ");
            int idade = t.nextInt();
            somaIdades += idade;
            contagemIdades++;
            if (idade >= 21) {
                pessoasComOuAcima21++;
            }
            System.out.print("Você quer continuar(S/N)? ");            
            resp = t.next().toUpperCase().charAt(0);            
        } while (resp == 'S');

        t.close();

        //calcula media de idades
        float media = somaIdades / (float) contagemIdades;

        //exibe resultados
        System.out.println("Quantidade de idades digitadas: " + contagemIdades);
        System.out.println("Média das idades: " + String.format("%.1f", media));
        System.out.println("Pessoas com ou acima dos 21 anos: " + pessoasComOuAcima21);

    }
    
}
