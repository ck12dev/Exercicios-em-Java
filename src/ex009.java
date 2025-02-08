/*Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. */

import java.util.Scanner;

public class ex009 {

    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);

        System.out.print("Digite quantos reais você tem na carteira: ");
        double r = t.nextFloat();

        double txCambio = 6.10;
        double dol = r / txCambio;

        System.out.printf("R$ %.2f equivale a US$ %.2f", r, dol);

        t.close();

    }
    
}
