/* Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem vário
Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
+-------=======------+
 Aprendendo Portugol
 Aprendendo Portugol
 Aprendendo Portugol
 Aprendendo Portugol
+-------=======------+ */

import java.util.Scanner;

public class ex088 {
    static void Gerador(String txt, int vzs) {
        for (int c = 0; c < vzs; c++){
            System.out.println("| " + txt + " |");
        }
    }
    public static void main(String[] args) {
        
        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);
        
        System.out.print("Digite o texto desejado: ");
        String s = t.nextLine();
        System.out.print("Quantas vezes o texto deve ser repetido? ");
        int vezes = t.nextInt();
        System.out.println("+-------=======------+");
        Gerador(s, vezes);
        System.out.println("+-------=======------+");

        t.close();
    }
    
}
