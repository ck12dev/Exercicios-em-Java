/* Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
qual foi o maior e qual foi o menor preço digitados. */

import java.util.Scanner;

public class ex51 {

    public static void main(String[] args) {
        
        int c = 1;
        double maiorValor = 0;
        double menorValor = 0;

        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //le os preços e verifica o maior e o menor
        while (c <= 8) {
            System.out.print("Digite o valor do " + c + "º produto: R$");
            double valor = t.nextDouble();
            if (valor > maiorValor) {
                maiorValor = valor;
            }
            if (menorValor == 0 || valor < menorValor) {
                menorValor = valor;
            }
            c++;
        }

        t.close();

        //mostra o maior e menor valores
        System.out.println("Maior valor: R$" + String.format("%.2f", maiorValor));
        System.out.println("Menor valor: R$" + String.format("%.2f", menorValor));

    }
    
}
