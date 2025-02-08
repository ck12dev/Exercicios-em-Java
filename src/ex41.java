/* Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou! */

public class ex41 {

    public static void main(String[] args) {
        
        int c = 100;

        //faz a contagem
        while (c >= 0) {
            if (c == 0) {
                System.out.print(c + " Acabou!");
            } else {
                System.out.print(c + " ");
            }
            c -= 5;
        }

    }
    
}
