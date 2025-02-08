/*Crie um programa que tenha uma função Media(), que vai receber as 2 notas de
um aluno e retornar a sua média para o programa principal. */

import java.util.Scanner;

public class ex096 {

    public static Float Media(float x, float y) {
        return (x + y) / 2;
    }
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Digite a primeira nota do aluno: ");
        float n1 = t.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        float n2 = t.nextFloat();

        t.close();

        System.out.println("A média do aluno é: " + String.format("%.1f", Media(n1, n2)));
    }
    
}
