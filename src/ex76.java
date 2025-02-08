/* Crie um programa que preencha automaticamente um vetor numérico com 7
números gerados aleatoriamente pelo computador e depois mostre os valores
gerados na tela. */

import java.util.Random;

public class ex76 {

    public static void main(String[] args) {
        
        //cria vetor do tipo inteiro
        int v[] = new int[7];

        //cria objeto do tipo Random pra gerar numeros aleatorios
        Random aleatorio = new Random();

        System.out.print("Valores gerados para o vetor: ");
        //laço pra atribuir numeros aleatorios no vetor
        for (int c = 0; c < v.length; c++) {
            v[c] = aleatorio.nextInt(100) + 1; //recebe o valor aleatorio, entre 0 e 99, gerado pelo computador, + 1
            System.out.print(v[c] + " ");
        }
       
    }
    
}
