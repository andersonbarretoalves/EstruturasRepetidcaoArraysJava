package Ex2;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Digite uma Letra: ");
            String letra = scam.next();


            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ) {
                        consoantes[count] = letra;
                        quantidadeConsoantes++;
            }

            count++;

        }
        while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for ( String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
        System.out.println("Total de letras digitadas: " + consoantes.length);

    }
}
