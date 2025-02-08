/*A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado. */

import java.util.Scanner;

public class ex014 {

    public static void main(String[] args) {

        //cria um objeto 't' para ler as entradas de dados
        Scanner t = new Scanner(System.in);

        //pergunta a quantidade de km percorridos e quantos dias alugados
        System.out.print("Digite a quantidade de Km percorridos: ");
        int km = t.nextInt();
        System.out.print("Digite quantos dias o carro foi alugado: ");
        int dias = t.nextInt();

        //calcula o valor por dia alugado e km rodado
        double vKm = (double) km * 0.20;
        double vDias = (double) dias * 90;

        //calcula o total a pagar
        double total = vKm + vDias;

        //mostra os valores pro usuario
        System.out.printf("Valor total de %dKm rodados: R$ %.2f\n" +
                            "Valor total de %d dias alugado: R$ %.2f\n" +
                            "Valor total do aluguel: R$ %.2f\n",km, vKm, dias, vDias, total);

        t.close();
        
    }
    
}
