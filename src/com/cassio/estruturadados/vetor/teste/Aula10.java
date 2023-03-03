package com.cassio.estruturadados.vetor.teste;

import com.cassio.estruturadados.vetor.Vetor;
import com.cassio.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);
        Contato c1 = new Contato("Contato1", "123456789", "contato1@gmail.com");
        Contato c2 = new Contato("Contato2", "956451234", "contato2@gmail.com");
        Contato c3 = new Contato("Contato3", "557551234", "contato3@gmail.com");

        Contato c4 = new Contato("Contato3", "557551234", "contato3@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());

        System.out.println("Busca pelo contato = 'c4'");
        int pos = vetor.busca(c4);
        if (pos > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);

    }
}
