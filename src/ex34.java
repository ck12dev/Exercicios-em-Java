/*O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
indivíduo dentro de certas faixas.
 - abaixo de 18.5: Abaixo do peso
 - entre 18.5 e 25: Peso ideal
 - entre 25 e 30: Sobrepeso
 - entre 30 e 40: Obesidade
 - acima de 40: Obseidade mórbida */

import java.util.Scanner;

public class ex34 {

    public static void main(String[] args) {
        
        //cria um objeto pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //le a altura e peso do usuario
        System.out.print("Digite a altura(m): ");
        float alt = t.nextFloat();
        System.out.print("Digite o peso(kg): ");
        float peso = t.nextFloat();

        //calcula e mostra imc
        float imc = (peso / alt * alt);
        System.out.println("IMC: " + imc);

        //verifica imc
        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Peso ideal.");
        } else if (imc < 30) {
            System.out.println("Sobrepeso.");
        } else if (imc < 40){
            System.out.println("Obesidade.");
        } else {
            System.out.println("Obesidade mórbida.");
        }

        t.close();

    }
    
}
