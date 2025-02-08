/*Crie um programa que preencha automaticamente (usando lógica, não apenas
atribuindo diretamente) um vetor numérico com 15 posições com os primeiros
elementos da sequência de Fibonacci:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 */

public class ex75 {
    public static void main(String[] args) {

        //vetor pra numeros inteiros
        int v[] = new int[15];
        int termo1 = 1;
        int termo2 = 1;
        
        //laço pra sequencia de fibonacci
        for (int c = 0; c < v.length; c++) {
            v[c] = termo1;
            System.out.print(v[c] + " ");
            int termoAtual = termo1 + termo2;
            termo1 = termo2;
            termo2 = termoAtual;
        }

        //pula linha
        System.out.println();

        //laço pra mostrar as posições do vetor
        for (int c = 0; c < v.length; c++) {
            System.out.print(c + " ");
        }

    }
    
}
