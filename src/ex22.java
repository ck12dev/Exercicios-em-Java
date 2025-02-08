/*Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento. */

import java.util.Calendar;
import java.util.Scanner;

public class ex22 {

    public static void main(String[] args) {
        
        int anosDif;

        //cria um objeto pra dados de entrada
        Scanner t = new Scanner(System.in);

        //cria um objeto pro ano atual
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        //le o ano de nascimento
        System.out.print("Digite o ano em que você nasceu: ");
        int anoN = t.nextInt();

        //calcula a idade
        int idade = anoAtual - anoN;

        //verifica se pode se alistar e quantos anos faltam ou passaram
        if (idade < 18) {
            anosDif = 18 - idade;
            System.out.println("Você ainda não pode se alistar, ainda faltam " + anosDif + " anos.");
        } else {
            anosDif = idade - 18;
            System.out.println("Você já pode se alistar, já se passaram " + anosDif + " anos.");
        }

        t.close();

    }
    
}
