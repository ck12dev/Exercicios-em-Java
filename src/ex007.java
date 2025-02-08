/*Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666 */

import java.util.Scanner;

public class ex007 {

    public static void main(String[] args) {
        
        //cria um objeto 't' da classe Scanner para ler objetos de entrada
        Scanner t = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float n = t.nextFloat(); //lê o numero digitado pelo usuario e armazena em 'n'

        float dobro = n * 2; //calcula o dobro de 'n'
        float terca = n / 3; //calcula a terça parte de 'n'

        //exibe o dobro e a terça parte de 'n' na tela
        System.out.printf("O dobro de %.2f é %.2f\n", n, dobro);
        System.out.printf("A terça parte de %.2f é %.2f\n", n,  terca);

        t.close();

    }
    
}
