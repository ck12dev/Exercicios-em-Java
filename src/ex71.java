/* Faça um programa que preencha automaticamente um vetor numérico com 8
posições, conforme abaixo:
999 999 999 999 999 999 999 999
0 1 2 3 4 5 6 7 */

public class ex71 {
    public static void main(String[] args) {
        
        //cria objeto pro vetor do tipo inteiro
        int v[] = new int [8];

        //laço pra colocar numeros no vetor
        for (int c = 0; c <= v.length - 1; c++) {
            v[c] = 999;
            System.out.print(v[c] + " ");
        }

        //pula as linhas
        System.out.println();

        //int pra mostrar as posições do vetor
        for (int c = 0; c < v.length; c++) {
            System.out.print(" " + c + "  ");
        }

    }
    
}
