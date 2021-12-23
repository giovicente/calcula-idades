package com.letscode.arrays.service;

import com.letscode.arrays.entidades.Pessoa;
import com.letscode.arrays.utils.Impressora;

import java.util.Scanner;

public class Calculadora {

    public static void calculaIdades() {
        Scanner scanPessoa = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[3];


        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();

            Impressora.imprimirMensagemInserirNome(i);
            pessoas[i].setNome(scanPessoa.next());
            Impressora.imprimirMensagemInserirIdade(i);
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

        Impressora.imprimirMensageMaiorIdade(maiorIdade);
        Impressora.imprimirMensageMenorIdade(menorIdade);
        Impressora.imprimirMensagemMediaIdade(mediaIdade);
    }

}
