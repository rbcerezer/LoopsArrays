package br.com.dio.exercicios.arrays;

import java.util.Scanner;

/*
Criando um programa que leia um vetor de seis caracterese nos diga
quantas consoantes foram digitadas, imprimindo tais consoantes.
 */
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int count = 0;
        do{
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if (! (letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")))  {
                consoantes[count] = letra;
                quantConsoantes++;

            }
            count++;


        } while(count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes  ) {
            if(consoante != null)
                System.out.println(consoante + " ");

        }
        System.out.println("Quantidade de consoantes digitadas: " + quantConsoantes);



    }
}
