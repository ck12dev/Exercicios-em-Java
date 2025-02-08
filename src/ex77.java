/*Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
final, mostre uma listagem com todos os nomes informados, na ordem inversa
daquela em que eles foram informados. */

import java.util.Scanner;

public class ex77 {

    public static void main(String[] args) {
        
        //cria vetor do tipo Strings
        String nomes[] = new String[7];

        //objeto pra ler entradas
        Scanner t = new Scanner(System.in);

        //laço pra ler os nomes
        for (int c = 0; c < nomes.length; c++) {
            System.out.print("Digite o " + (c + 1) + "º nome: " );
            String nome = t.nextLine();
            nomes[c] = nome;
        }

        t.close();

        System.out.print("Nomes na ordem inversa: ");
        //mostra os nomes na ordem inversa
        for (int c = 6; c >= 0; c--) {
            if (c > 0) {
                System.out.print(nomes[c] + ", ");
            } else {
                System.out.print(nomes[c]);                
            }
        }

    }
    
}
