/*Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10*/

import java.util.Scanner;

public class ex006 {

    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in); //cria um objeto 't' da classe Scanner para ler dados de entrada

        //pede um número para o usuário
        System.out.print("Digite um número: ");
        int n = t.nextInt(); //lê o número digitado e armazena na variavel 'n'

        //mostra o antecessor e sucessor do número digitado
        System.out.println("O antecessor de " + n + " é " + (n - 1));
        System.out.println("O sucessor de " + n + " é " + (n + 1));

        t.close(); //fecha o objeto 't'

    }
    
}
