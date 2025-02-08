/*Crie um programa que melhore o procedimento Gerador() da questão anterior
para que o programador possa escolher uma entre três bordas:
 +-------=======------+ Borda 1
 ~~~~~~~~:::::::~~~~~~~ Borda 2
 <<<<<<<<------->>>>>>> Borda 3
Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
~~~~~~~~:::::::~~~~~~~
 Portugol Studio
 Portugol Studio
 Portugol Studio
~~~~~~~~:::::::~~~~~~~ */

import java.util.Scanner;

public class ex089 {
    static void Gerador(String txt, int x, int y) {
       
        switch (x) {
            case 1:
                System.out.println("+-------=======------+");
                break;
            case 2:
                System.out.println("~~~~~~~~:::::::~~~~~~~");
                break;
            case 3:
                System.out.println("<<<<<<<<------->>>>>>>");
                break;        
        }
        for (int c = 0; c < y; c++) {
            System.out.println(txt);
        }
        switch (x) {
            case 1:
                System.out.println("+-------=======------+");
                break;
            case 2:
                System.out.println("~~~~~~~~:::::::~~~~~~~");
                break;
            case 3:
                System.out.println("<<<<<<<<------->>>>>>>");
                break;        
        }
    }
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.print("Digite um texto pra colocar entre as bordas: ");
        String texto = t.nextLine();
        System.out.print("Quantas vezes o texto será repetido? ");
        int vezes = t.nextInt();

        System.out.print("Bordas disponíveis:\n" +
                        "Borda [1]: +-------=======------+\n" +
                        "Borda [2]: ~~~~~~~~:::::::~~~~~~~\n" +
                        "Borda [3]: <<<<<<<<------->>>>>>>\n" +
                        "Qual borda você deseja? ");
        int escolha1 = t.nextInt();

        t.close();

        Gerador(texto, escolha1, vezes);

    }
}
