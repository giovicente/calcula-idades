package com.letscode.arrays.service;

import com.letscode.arrays.entidades.Pessoa;

import java.util.Scanner;

public class Calculadora {

    public static void calculaIdades() {
        Pessoa[] pessoas = new Pessoa[4];
        Scanner scanPessoa = new Scanner(System.in);

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();

            System.out.print("Digite o nome: ");
            pessoas[i].setNome(scanPessoa.next());
            System.out.print("Digite a idade: ");
            pessoas[i].setIdade(scanPessoa.nextInt());
        }

        int maiorIdade = pessoas[0].getIdade();
        int menorIdade = pessoas[0].getIdade();
        int somaIdade = 0;

        for (int i = 0; i < pessoas.length; i++) {

            if (pessoas[i].getIdade() < menorIdade) {
                menorIdade = pessoas[i].getIdade();
            } else if (pessoas[i].getIdade() > maiorIdade) {
                maiorIdade = pessoas[i].getIdade();
            }

            somaIdade += pessoas[i].getIdade();
        }

        float mediaIdade = (somaIdade / pessoas.length);

        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Média de idade: " + mediaIdade);
    }

}
