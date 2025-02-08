/* Escreva um programa que mostre na tela a seguinte contagem:
6 7 8 9 10 11 Acabou! */

public class ex38 {

    public static void main(String[] args) {
        
        int c = 6;
        
        //faz a contagem
        while (c <= 11) {
            if (c == 11) {
                System.out.print(c + " Acabou!");
            } else {
                System.out.print(c + " ");
            }
            c++;
        }

    }
    
}
