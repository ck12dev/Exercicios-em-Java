/* Crie um programa que leia vários números pelo teclado e mostre no final o
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado */

import java.util.Scanner;

public class ex056 {

    public static void main(String[] args) {
        
        int num = 0;
        int soma = 0;

        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //le os numeros ate o usuario digitar 1111        
        do {
            System.out.print("Digite qualquer número (para sair digite 1111): ");
            num = t.nextInt();
            if (num == 1111) {
                break;
            }
            soma += num;
        } while (true);
        t.close();

        System.out.println("A soma dos números digitados é: " + soma);

    }
    
}
