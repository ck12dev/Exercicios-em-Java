/*Escreva um programa para aprovar ou não o empréstimo bancário para a compra
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
ela não pode exceder 30% do salário ou então o empréstimo será negado.
 */

import java.util.Scanner;

public class ex033 {

    public static void main(String[] args) {
        
        //cria um objeto pra ler dados de entrada
        Scanner t = new Scanner(System.in);

        //le os valores da casa, salario e anos
        System.out.print("Digite o valor da casa R$");
        double vCasa = t.nextDouble();
        System.out.print("Digite o salário do comprador R$"); 
        double sal = t.nextDouble();
        System.out.print("Digite em quantos anos o comprador vai pagar: ");
        int anosPag = t.nextInt();

        //calculo da prestação mensal e 30% do salario
        double prestMensal = vCasa / (anosPag * 12);
        double sal30PorCento = sal * 0.30; 

        //mostra os valores
        System.out.printf("Salário do comprador: R$%.2f%n" +
                            "30%% do salário: R$%.2f%n", sal, sal30PorCento);
        System.out.printf("Valor da casa: R$%.2f%n" +
                            "Anos pagando: %d%n" +
                            "Valor mensalidade: R$%.2f%n", vCasa, anosPag, prestMensal);

        //verifica se o emprestimo sera aprovado
        if (prestMensal <= sal30PorCento) {
            System.out.println("O empréstimo foi aprovado.");
        } else {
            System.out.println("O empréstimo foi negado.");
        }

        t.close();

    }
    
}
