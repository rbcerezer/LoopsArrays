package br.com.dio.exercicios.loops;

/*
* Construindo um programa onde peça uma X quantidade de números inteiros,
* depois mostre a quantidade de números pares e ímpares respectivamente
* */

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantos números você deseja?: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantPares++;
            else quantImpares++;

            count++;

        } while (count < quantNumeros);

        System.out.println("Temos " + quantPares + " números pares!" );
        System.out.println("Temos " + quantImpares + " números ímpares!" );
    }
}
