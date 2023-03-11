package br.com.dio.exercicios.arrays;

import java.sql.SQLOutput;
import java.util.Random;

/*
* gerando uma matriz M 4x4 com valores aleatorios entre 0 e 9
* */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for (int linhas = 0; linhas < M.length; linhas++) {
            for (int colunas = 0; colunas < M[linhas].length; colunas++) {
                M[linhas][colunas] = random.nextInt(9);
            }
        }

            System.out.println("Matriz: ");
            for (int[] linha : M) {
                for (int coluna : linha) {
                    System.out.println(coluna + " ");

                }
                System.out.println();

            }


        }
    }
