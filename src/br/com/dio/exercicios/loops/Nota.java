package br.com.dio.exercicios.loops;

/*
* Exercício 02:
* Desenvolvendo um programa em que é pedido uma nota, entre zero e dez.
* Caso a nota seja inválida, continuar pedindo até que o usuário
* digite um valor que seja válido
* */

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;


        System.out.println("Insira uma nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota INVÁLIDA! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
