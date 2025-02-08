/*Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
no final:
a) Qual foi a média de altura do grupo
b) Quantas pessoas pesam mais de 90Kg
c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg. */

import java.util.Scanner;

public class ex54 {

    public static void main(String[] args) {
        
        int c = 1;
        float sAltura = 0;
        float mAltura;
        int pesoAcima90 = 0;
        int abaixo50KgEMenos160Alt = 0;
        int acima100KgEMais190Alt = 0;
        int totalPessoas = 0;

        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //le os dados e verifica as opçoes
        while (c <= 7) {
            System.out.print("Digite a altura da " + c + "ª pessoa (m): ");
            float altura = t.nextFloat();
            System.out.print("Digite o peso da " + c + "ª pessoa (Kg): ");
            float peso = t.nextFloat();
            sAltura += altura;
            if (peso > 90) {
                pesoAcima90++;
            }
            if (peso < 50 && altura < 1.60) {
                abaixo50KgEMenos160Alt++;
            }
            if (peso > 100 && altura > 1.90) {
                acima100KgEMais190Alt++;
            }
            c++;
            totalPessoas++;
        }
        t.close();

        //calcula media de altura
        mAltura = sAltura / (float) totalPessoas;

        //exibe os resultados
        System.out.println("Média de altura do grupo: " + String.format("%.2f", mAltura + "m."));
        System.out.println("Pessoas acima dos 90Kg: " + pesoAcima90);
        System.out.println("Pessoas abaixo de 50Kg e abaixo de 1,60m: " + abaixo50KgEMenos160Alt);
        System.out.println("Pessoas acima de 100Kg e acima de 1,90m: " + acima100KgEMais190Alt);

    }
    
}
