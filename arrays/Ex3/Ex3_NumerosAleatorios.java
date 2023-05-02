package Ex3;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatoris = new int[20];


        for (int i = 0; i < numerosAleatoris.length ; i++) {
            int numero = random.nextInt(100);
            numerosAleatoris[i] = numero;
        }

        System.out.print("Numeros Aleatórios: ");
        for (int numero : numerosAleatoris ) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessor dos Números Aleatórios: ");
        for (int numero : numerosAleatoris) {
            System.out.print(numero + 1 + " ");
        }

        System.out.print("\nAntecessor dos Números Aleatórios: ");
        for (int numero : numerosAleatoris) {
            System.out.print(numero - 1 + " ");
        }
    }
}
