/*Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
5 3 5 3 5 3 5 3 5 3
0 1 2 3 4 5 6 7 8 9 */

public class ex74 {
    public static void main(String[] args) {
        
        //vetor do tipo inteiro
        int v[] = new int[10];
        
        //laço pra preencher as posições do vetor com base nas condições
        for (int c = 0; c < v.length; c++) {
            v[c] = c % 2 == 0 ? 5 : 3;
            System.out.print(v[c] + " ");
        }
        
        //pula leia
        System.out.println();

        //laço pra mostrar as posições do vetor
        for (int c = 0; c < v.length; c++) {
            System.out.print(c + " ");
        }

    }
}
