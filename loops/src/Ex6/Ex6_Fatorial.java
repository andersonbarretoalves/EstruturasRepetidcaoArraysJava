package Ex6;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Fatorial: ");
        int fatorial = scan.nextInt();

        int mult = 1;

        for (int i = fatorial; i >= 1; i-- ){
            mult = mult * i;
        }
        System.out.println("O Fatorial de " + fatorial + "! é: " + mult);
    }
}
