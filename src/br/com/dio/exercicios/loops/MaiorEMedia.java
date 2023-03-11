package br.com.dio.exercicios.loops;

/*
* Exercicio 03:
* Fazer um programa que leia apenas 05 numeros
* e no final informe o número maior dentre eles e a média
* dessed números
* */

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;


        int count = 0;
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            count = count + 1;

            soma = soma + numero;

            if (numero > maior) maior = numero;



        } while(count < 5);

        System.out.println("Maior número é o : " + maior);
        System.out.println("A media é: " + (soma/5));
    }
}
