/* Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou! */

public class ex39 {

    public static void main(String[] args) {
        
        int c = 10;

        //faz a contagem
        while (c >= 3) {
            if (c == 3) {
                System.out.print(c + " Acabou!");
            } else {
                System.out.print(c + " ");
            }

            c--;
        }

    }
    
}
