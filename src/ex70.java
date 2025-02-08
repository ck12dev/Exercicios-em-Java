/*Faça um programa que mostre os 10 primeiros elementos da Sequência
de Fibonacci:
1 1 2 3 5 8 13 21... */

public class ex70 {

    public static void main(String[] args) {
        
        int primeiroTermo = 1;
        int segundoTermo = 1;

        System.out.println("Sequência de Fibonacci: ");        
        
        //laço pra Fibonacci
        for (int i = 1; i <= 10; i++) {
            System.out.print(primeiroTermo + " ");            
            int termoAtual = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = termoAtual;            
        }

    }
    
}
