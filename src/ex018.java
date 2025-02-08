/*Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar.
 */

import java.util.Calendar;
import java.util.Scanner;

public class ex018 {

    public static void main(String[] args) {
        
        //cria um objeto 't' pra ler os dados de entrada
        Scanner t = new Scanner(System.in);

        //cria uma referencia para o ano atual
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        //pergunta e le o ano de nascimento
        System.out.print("Digite o ano que você nasceu: ");
        int anoNasc = t.nextInt();

        //calcula a idade
        int idade = anoAtual - anoNasc;

        //verifica se pode votar
        if (idade >= 16) {
            System.out.println("Você tem " + idade + " anos e pode votar.");
        } else {
            System.out.println("Você tem " + idade + " anos e não pode votar.");
        }

        t.close();

    }
    
}
