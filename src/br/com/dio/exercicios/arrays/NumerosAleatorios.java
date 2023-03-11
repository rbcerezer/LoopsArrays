package br.com.dio.exercicios.arrays;
/*
* projetando um programa que leia aleatoriamente vinte numeros inteiros
* (entre 0 e 100) armazenando-os em um vetor.
* Depois os numeros deverão ser mostrados com seus sucessores*/

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;


        }
        System.out.println("Números Aleatótios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }
        System.out.println("Sucessores dos Números Aleatótios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1) + " ");
        }

        /*System.out.println("Antecessores dos Números Aleatótios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero-1) + " ");
        }*/
        //como seriam para visualizar os antecessores

    }
}
