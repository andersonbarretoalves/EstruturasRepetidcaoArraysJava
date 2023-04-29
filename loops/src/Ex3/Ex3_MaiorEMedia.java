package Ex3;

import java.util.Scanner;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int numeroMair =0;
        int soma = 0;
        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero > numeroMair) numeroMair = numero;

            count = count + 1;

            soma = soma + numero;
        }
        while (count < 5);

        System.out.println("O numero maior é: " + numeroMair);
        System.out.println("A média dos numeros é: " + soma/5);
    }
}
