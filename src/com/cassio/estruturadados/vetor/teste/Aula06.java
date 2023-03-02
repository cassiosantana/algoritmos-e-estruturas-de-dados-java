package com.cassio.estruturadados.vetor.teste;

import com.cassio.estruturadados.vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento1"); // posicao 0
        vetor.adiciona("elemento2"); // posicao 1
        vetor.adiciona("elemento3"); // posicao 2

        System.out.println(vetor.busca("Elemento1"));
    }
}
