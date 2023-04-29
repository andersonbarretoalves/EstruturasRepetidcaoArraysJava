package Ex4;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int count = 0;
        int numero;
        int quantPar = 0;
        int quantImpar = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantPar++;
            else quantImpar++;

            count++;
        }
        while (count < quantNumeros);
        System.out.println("A quantidade de números Pares é: " + quantPar);
        System.out.println("A quantidade de números Ímpares é: " + quantImpar);
    }
}
