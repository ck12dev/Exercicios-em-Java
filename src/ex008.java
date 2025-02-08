/*Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 185.7m corresponde a:
0.18572Km   1857.2dm
1.8572Hm    18572.0cm
18.572Dam   185720.0mm */

import java.util.Scanner;

public class ex008 {

    public static void main(String[] args) {
        
        //cria um objeto 't' da classe Scanner para ler os dados de entrada
        Scanner t = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        float dM = t.nextFloat(); //lê o número inserido pelo usuário

        float dKm = dM / 1000; //calcula Km
        float dHm = dM / 100; //calcula Hm
        float dDam = dM / 10; //calcula Dam
        float dDm = dM * 10; //calcula Dm
        float dCm = dM * 100; //calcula Cm
        float dMm = dM * 1000; //calcula Mm

        //mostra o resultado dos calculos pro usuário
        System.out.printf("A distância de %.2fm corresponde a:\n" +
                        "%.5fKm\n" +
                        "%.4fHm\n" +
                        "%.3fDam\n" +
                        "%.1fdm\n" +
                        "%.1fcm\n" +
                        "%.1fmm\n", dM, dKm, dHm, dDam, dDm, dCm, dMm);

        t.close(); //fecha 't'

    }
    
}