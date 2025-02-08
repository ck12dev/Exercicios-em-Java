/*Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
9 8 7 6 5 4 3 2 1 0
0 1 2 3 4 5 6 7 8 9 */

public class ex073 {
    public static void main(String[] args) {
        
        //cria vetor do tipo inteiro
        int v[] = new int[10];

        //preenche as posições do vetor
        for (int c = 0; c < v.length; c++) {
            v[c] = v.length - (c + 1);
            System.out.print(v[c] + " ");
        }

        //pula linha
        System.out.println();

        //laço pra mostrar as posições
        for (int c = 0; c < v.length; c++) {
            System.out.print(c + " ");
        }

    }
    
}
