package br.com.dio.exercicios.loops;

/*
* objetivo do exercício:
* Fazer um programa que leia o conjunto de dois valores,
* o primeiro apresentando o nome e o segundo a idade
* Parar o programa quando for inserido o valor "0" no campo nome!
* */

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scanner.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scanner.nextInt();
        }

        System.out.println("Acabamos por aqui!!");



    }
}
