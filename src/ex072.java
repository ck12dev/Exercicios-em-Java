/*Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
5 10 15 20 25 30 35 40 45 50
0 1 2 3 4 5 6 7 8 9 */

public class ex072 {
    public static void main(String[] args) {
        
        //vetor do tipo inteiro
        int v[] = new int[10];

        //preenche o vetor com lógica
        for (int c = 0; c < v.length; c++) {
            v[c] = 5 * (c + 1);
            System.out.print(v[c] + " ");
        }

        //pula linha
        System.out.println();

        for (int c = 0; c < v.length; c++) {
            System.out.print(c + " ");
        }
    }
    
}
