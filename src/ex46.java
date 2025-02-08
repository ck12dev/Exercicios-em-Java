/* Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
8 + 10 + 12 + 14 + ... + 98 + 100. */

public class ex46 {

    public static void main(String[] args) {
        
        int i = 6;
        int f = 100;
        int s = 0;
        String soma = "";

        //faz a soma
        while (i <= f) {
            if (i == f){
                soma += i;
            } else {
                soma += i + " + ";
            }
            s += i;
            i += 2;
        }

        //mostra o resultado
        System.out.println("A soma dos valores " + soma + " = " + s);

    }
    
}
