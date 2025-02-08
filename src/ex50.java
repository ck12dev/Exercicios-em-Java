/*Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
mostre na tela:
a) Quais foram os números sorteados
b) Quantos números estão acima de 5
c) Quantos números são divisíveis por 3 */

public class ex50 {

    public static void main(String[] args) {
        
        int c = 1;
        int numAcima5 = 0;
        int numDivide3 = 0;
             
        //objeto pra montar Strings
        StringBuilder sorteados = new StringBuilder();

        //sorteia os numeros e faz verificações
        while (c <= 20) {
            int numAle = (int) (Math.random() * 11);
            sorteados.append(numAle);
            if (c < 20) {
                sorteados.append(", ");
            }
            if (numAle > 5) {
                numAcima5++;
            }
            if (numAle % 3 == 0) {
                numDivide3++;
            }
            c++;
        }

        //exibe os resultados
        System.out.println("Números sorteados: " + sorteados);
        System.out.println("Acima de 5: " + numAcima5);
        System.out.println("Divisíveis por 3: " + numDivide3);

    }
    
}
