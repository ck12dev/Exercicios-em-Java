/* Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou! */

public class ex040 {

    public static void main(String[] args) {
        
        int c = 0;

        //faz a contagem
        while (c <= 18) {
            if (c == 18) {
                System.out.print(c + " Acabou!");
            } else {
                System.out.print(c + " ");
            }
            c += 3;
        }

    }
    
}
