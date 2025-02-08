/*Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
450 + 400 + 350 + 300 + ... + 50 + 0 */

public class ex047 {

    public static void main(String[] args) {
        
        int i = 500;
        int f = 0;
        int sm = 0;
        String soma = "";

        //faz a soma do valores
        while (i >= f) {
            if (i == f) {
                soma += i;
            } else {
                soma += i + " + ";
            }
            sm += i;
            i -= 50;
        }

        System.out.printf("A soma dos valores " + soma + " = " + sm);

    }
    
}
