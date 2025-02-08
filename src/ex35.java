/*Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
tabela a seguir:
 - Carros populares (aluguel de R$90 por dia)
 - Até 100Km percorridos: R$0,20 por Km
 - Acima de 100Km percorridos: R$0,10 por Km
 - Carros de luxo (aluguel de R$150 por dia)
 - Até 200Km percorridos: R$0,30 por Km
 - Acima de 200Km percorridos: R$0,25 por Km */

import java.util.Scanner;

public class ex35 {

    static String tipoCarro(int carro) {
        switch (carro) {
            case 1:
                return "Carro popular";
            case 2:
                return "Carro de luxo";
            default:
                return "Opção inválida";

        }
    }

    static double valorTotal(int carro, int dias, int km) {
        double valAluCarro, valPorKm;
        switch (carro) {
            case 1:
                valAluCarro = 90 * dias;
                if (km <= 100) {
                    valPorKm = km * 0.2;
                } else {
                    valPorKm = km * 0.1;
                }
                return valAluCarro + valPorKm;
            case 2:
                valAluCarro = 150 * dias;
                if (km <= 200) {
                    valPorKm = km * 0.3;
                } else {
                    valPorKm = km * 0.25;
                }
                return valAluCarro + valPorKm;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        // cria um objeto pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        // le o tipo de carro, km percorrido e dias alugados
        System.out.printf("Tipos de carros:%n [1] - Carro popular%n [2] - Carro de luxo%n");
        System.out.print("Digite o tipo de carro que foi alugado: ");
        int carro = t.nextInt();
        System.out.print("Digite quantos Kms foram percorridos: ");
        int km = t.nextInt();
        System.out.print("Quantos dias o carro foi alugado: ");
        int dias = t.nextInt();

        //chama os metodos
        String tipoCarro = tipoCarro(carro);
        double valorTotal = valorTotal(carro, dias, km);

        // verifica o valor e mostra na tela
        if (valorTotal == 0) {
            System.out.println("Opção de carro inválida");
        } else {
            System.out.println("O valor do aluguel do " + tipoCarro + " será de R$" + valorTotal);            
        }

        t.close();

    }

}
