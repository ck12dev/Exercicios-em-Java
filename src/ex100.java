/*Melhore o exercício 96, criando além da função Media() uma outra função
chamada Situacao(), que vai retornar para o programa principal se o aluno está
APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
parâmetro o resultado retornado pela função Media(). */

import java.util.Scanner;

public class ex100 {

    public static Float Media(float x, float y) {
        return (x + y) / 2;
    }

    public static String Situacao(float x) {
        if (x < 5) {
            return "REPROVADO.";
        } else if (x < 7) {
            return "EM RECUPERAÇÃO.";
        } else {
            return "APROVADO.";
        }
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Digite a primeira nota do aluno: ");
        float n1 = t.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        float n2 = t.nextFloat();

        t.close();

        System.out.println("A média do aluno é: " + String.format("%.1f", Media(n1, n2)) + "\nO aluno está " + Situacao(Media(n1, n2)));
    }
    
}
