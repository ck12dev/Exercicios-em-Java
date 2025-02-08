/*4)	Escrever um programa que leia o nome de um vendedor, 
o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
informar o seu nome, o salário fixo e salário no final do mês.*/

public class ex004 {
    
    public static void main(String[] args) {
        
        String nome = "Christian";
        double salarioFixo = 0;
        double totalVendas = 0;
        double comissaoVendas = 0;
        double salarioTotal;

        salarioFixo = 3000.50;
        totalVendas = 2543.35;
        comissaoVendas = totalVendas * 0.15;
        salarioTotal = salarioFixo + comissaoVendas;

        System.out.println("O Salário total do funcionário " + nome + " é: " + salarioTotal);


    }

}
