/*Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
 */

import java.util.Scanner;  //importa a classe Scanner para leitura dos dados de entrada.

public class ex5 {  //início da classe principal ex5.

    public static void main(String[] args) {  //método principal, onde a execução começa.

        Scanner t = new Scanner(System.in);  //cria um objeto 't' da classe Scanner para ler dados do teclado.
        
        //solicita ao usuário que insira a primeira nota.
        System.out.print("Digite a 1ª nota do aluno: ");
        float n1 = t.nextFloat();  //lê a primeira nota inserida e armazena na variável 'n1'.
        
        //solicita ao usuário que insira a segunda nota.
        System.out.print("Digite a 2ª nota do aluno: ");
        float n2 = t.nextFloat();  //lê a segunda nota inserida e armazena na variável 'n2'.

        //calcula a média das duas notas.
        float m = (n1 + n2) / 2;  //soma as duas notas e divide por 2 para calcular a média.
        
        //exibe as duas notas e a média calculada.
        System.out.println("Nota 1: " + n1);  //exibe a primeira nota.
        System.out.println("Nota 2: " + n2);  //exibe a segunda nota.
        System.out.println("A média do aluno: " + m);  //exibe a média calculada.

        t.close();

    }
}