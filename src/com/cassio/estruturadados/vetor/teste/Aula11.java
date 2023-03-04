package com.cassio.estruturadados.vetor.teste;

import com.cassio.estruturadados.vetor.Lista;

public class Aula11 {

    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<>(1);

        Contato c1 = new Contato("Contato1", "123456789", "contato1@gmail.com");
        Contato c2 = new Contato("Contato2", "956451234", "contato2@gmail.com");
        Contato c3 = new Contato("Contato3", "557551234", "contato3@gmail.com");
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

    }
}
