package br.com.dio.exercicios.arrays;

/*
* Progeto com objetivo de criar um vetor (Array)
* contendo seis números inteiros e mostra-los
* na ordem inversa*/

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int[] vetor = {-4,-1,3,8,15,59};

        //System.out.println(vetor); errado

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.println(vetor [count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length-1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");

        }






    }
}
