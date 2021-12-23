package com.letscode.arrays.utils;

public class Impressora {

    private static final String MENSAGEM_INSERIR_NOME = "Insira o nome da pessoa %d: ";
    private static final String MENSAGEM_INSERIR_IDADE = "Insira a idade da pessoa %d: ";
    private static final String MENSAGEM_MAIOR_IDADE = "A maior idade é %d.%n";
    private static final String MENSAGEM_MENOR_IDADE = "A menor idade é %d.%n";
    private static final String MENSAGEM_MEDIA_IDADE = "A média das idades é %.2f.%n";

    public static void imprimirMensagemInserirNome(int i) { System.out.printf(MENSAGEM_INSERIR_NOME, (i + 1)); }

    public static void imprimirMensagemInserirIdade(int i) { System.out.printf(MENSAGEM_INSERIR_IDADE, (i + 1)); }

    public static void imprimirMensageMaiorIdade(int maiorIdade) { System.out.printf(MENSAGEM_MAIOR_IDADE, maiorIdade); }

    public static void imprimirMensageMenorIdade(int menorIdade) { System.out.printf(MENSAGEM_MENOR_IDADE, menorIdade); }

    public static void imprimirMensagemMediaIdade(float mediaIdade) { System.out.printf(MENSAGEM_MEDIA_IDADE, mediaIdade); }

}
