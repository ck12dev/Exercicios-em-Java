/*Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
No final, mostre o total de salários pagos aos homens e o total pago às
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
sempre que ler os dados de um funcionário. */

import java.util.Scanner;

public class ex57 {

    public static void main(String[] args) {

        int sexo;
        float somaSalH = 0;
        float somaSalM = 0;
        
        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //pergunta o sexo, o salário e se quer continuar e também verifica as opçoes
        do {
            while (true) {
                System.out.print("Digite o sexo do funcionário\n [1] -- Homem [2] -- Mulher: ");
                sexo = t.nextInt();
                if (sexo == 1 || sexo == 2) {
                    break;
                } else {
                    System.out.println("Opção inválida.");
                }
            }
            System.out.print("Digite o salário do funcionario: R$");
            float sal = t.nextFloat();
            if (sexo == 1) {
                somaSalH += sal;
            } else {
                somaSalM += sal;
            }
            System.out.print("Você quer continuar?(S/N) ");
            char resp = t.next().charAt(0);
            if (resp == 'N' || resp == 'n') {
                break;
            }
        } while (true);

        t.close();

        //mostra os resultados
        System.out.println("Soma do salário dos homens: R$" + String.format("%.2f", somaSalH));
        System.out.println("Soma do salário das mulheres: R$" + String.format("%.2f", somaSalM));

    }
    
}
