/*Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas. */

import java.util.Scanner;

public class ex24 {

    public static void main(String[] args) {
        
        double valor;

        //cria um objeto pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //le a distancia que sera percorrida
        System.out.print("Digite a distância que você deseja percorrer(Km): ");
        int km = t.nextInt();

        //verifica a km e calcula o valor da corrida
        if (km <= 200) {
            valor = km * 0.5;
            System.out.println("O valor ao percorrer " + km + " será de R$" + valor);
        } else {
            valor = km * 0.45;
            System.out.println("O valor ao percorrer " + km + " será de R$" + valor);
        }

        t.close();

    }
    
}
