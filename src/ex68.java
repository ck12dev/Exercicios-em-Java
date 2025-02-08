/*Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
“para”. No final, mostre na tela:
a) Quantas mulheres foram cadastradas
b) Quantos homens pesam mais de 100Kg
c) A média de peso entre as mulheres
d) O maior peso entre os homens */

import java.util.Scanner;

public class ex68 {
    public static void main(String[] args) {

        float somaPesoMul = 0;
        int ehMulher = 0;
        int ehHomem = 0;
        int homemAcima100 = 0;
        float maiorPesoHomem = Float.MIN_VALUE;

        // objeto pra entradas
        Scanner t = new Scanner(System.in);

        for (int i = 1; i <= 8; i++) {
            System.out.print("Digite o sexo da " + i + "ª pessoa\n [1] -- Homem  [2] -- Mulher: ");
            int sexo = t.nextInt();
            System.out.print("Digite o peso(Kg) da " + i + "ª pessoa: ");
            float peso = t.nextFloat();

            if (sexo == 1) {
                ehHomem++;
                if (peso > 100) {
                    homemAcima100++;
                }
                if (peso > maiorPesoHomem) {
                    maiorPesoHomem = peso;
                }
            }

            if (sexo == 2) {
                somaPesoMul += peso;
                ehMulher++;
            }
        }

        t.close();

        // exibe resultados
        if (ehMulher > 0) {
            System.out.println("Mulheres cadastradas: " + ehMulher);
            // calcula media peso das mulheres
            float mediaMulheres = somaPesoMul / ehMulher;
            System.out.println("Média do peso das mulheres: " + String.format("%.1f", mediaMulheres) + "Kg.");
        } else {
            System.out.println("Nenhuma mulher cadastrada.");
        }
        if (ehHomem > 0) {
            System.out.println("Homens acima de 100Kg: " + homemAcima100);
        } else {
            System.out.println("Nenhum homem acima dos 100Kg.");
        }
        if (maiorPesoHomem != Float.MIN_VALUE) {
            System.out.println("Maior peso entre os homens: " + maiorPesoHomem + "Kg.");
        } else {
            System.out.println("Nenhum homem cadastrado.");
        }

    }

}
