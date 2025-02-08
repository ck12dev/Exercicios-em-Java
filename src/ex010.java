/*Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
 */

import java.util.Scanner;

public class ex010 {

    public static void main(String[] args) {
        
        //cria um objeto 't' pra ler os dados de entrada
        Scanner t = new Scanner(System.in);

        //pede a largura e altura da parede
        System.out.print("Digite a largura da parede: ");
        float larg = t.nextFloat();
        System.out.print("Digite a altura da parede: ");
        float alt = t.nextFloat();

        //calcular a area da parede e litros de tinta necessarios
        float area = alt * larg;
        float lit = area / 2;

        //exibe a area e litros necessarios
        System.out.printf("A área da parede a ser pintada é de %.2fm² e %.2fL de tinta", area, lit);

        t.close();

    }
    
}
