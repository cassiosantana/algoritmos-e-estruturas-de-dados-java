package com.cassio.estruturadados.vetor.teste;

import com.cassio.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adiciona("B"); // posicao 0
        vetor.adiciona("G"); // posicao 1
        vetor.adiciona("D"); // posicao 2
        vetor.adiciona("E"); // posicao 3
        vetor.adiciona("F"); // posicao 4

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        System.out.println("Remover o elemento A");

        int pos = vetor.busca("A");
        if (pos > -1) {
            vetor.remove(pos);
        } else {
            System.out.println("Elemento não existe no vetor");
        }
        System.out.println(vetor);
    }
}
