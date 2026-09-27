package com.jonatan.cursojava.aula12;

public class Vetores {
    public static void main(String[] args) {
        int[] vetor1 = new int[3];
        vetor1[0] = 1;
        vetor1[1] = 2;
        vetor1[2] = 3;
        int[] vetor2 = vetor1;

        vetor2[0] = 4;
        System.out.println(vetor1[0]);

        int[] vetor3 = vetor1.clone();
        vetor3[0] = 5;
        System.out.println(vetor1[0]);
    }
}
