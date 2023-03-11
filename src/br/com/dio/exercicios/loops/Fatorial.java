package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
* Criando um programa onde seja possivel calcular
* o fatorial de um número inteiro, que será escolhido pelo usuário.
* exemplo: 4!= 24 (4 x 3 x 2 x 1 =)
* */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você deseja o fatorial de qual numero? ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "! =");
        for(int i = fatorial ; i >= 1  ; i--) {
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);

    }
}
