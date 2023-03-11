package br.com.dio.exercicios.loops;

/*
* Desenvolvendo um programa gerador de tabuadas
* onde serão geradas as tabuadas do 1 ao 10.
* O usuário é quem poderá escolher a tabuada que deseja
* ver conforme o exemplo a segui
*
* Tabuada do 4:
* 7 x 1 = 7
* 7 x 2 = 14
* ...
* 7 x 10 = 70
* */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada você deseja ver?");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de" + tabuada);

        for(int i = 1 ; i <= 10 ; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
        }


    }
}
