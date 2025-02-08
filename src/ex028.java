/*Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP */

import java.util.Scanner;

public class ex028 {

    public static void main(String[] args) {
        
        //cria um objeto pra ler entrada de dados
        Scanner t = new Scanner(System.in);

        //le a largura e comprimento do terreno
        System.out.print("Digite a largura do terreno: ");
        double l = t.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        double c = t.nextDouble();

        //calcula area do terreno
        double a = c * l;

        System.out.println("Área do terreno: " + a + "m².");

        //verifica qual o tipo do terreno
        if (a <= 100) {
            System.out.println("TERRENO POPULAR");
        } else if (a <= 500) {        
            System.out.println("TERRENO MASTER");
        } else {
            System.out.println("TERRENO VIP");
        }

        t.close();

    }
    
}
