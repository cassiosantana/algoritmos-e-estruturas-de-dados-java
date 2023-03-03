package com.cassio.estruturadados.vetor.teste;

import com.cassio.estruturadados.vetor.Vetor;

public class Aula08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B"); // posicao 0
        vetor.adiciona("C"); // posicao 1
        vetor.adiciona("E"); // posicao 2
        vetor.adiciona("F"); // posicao 3
        vetor.adiciona("G"); // posicao 4

        System.out.println(vetor);
    }
}
