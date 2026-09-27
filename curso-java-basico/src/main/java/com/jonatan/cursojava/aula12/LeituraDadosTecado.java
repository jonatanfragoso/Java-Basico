package com.jonatan.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTecado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCompleto = leitor.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);
    }
}
