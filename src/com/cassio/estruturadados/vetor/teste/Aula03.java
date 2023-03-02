package com.cassio.estruturadados.vetor.teste;

import com.cassio.estruturadados.vetor.Vetor;

public class Aula03 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        try {
            vetor.adiciona("elemento1");
            vetor.adiciona("elemento2");
            vetor.adiciona("elemento3");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
