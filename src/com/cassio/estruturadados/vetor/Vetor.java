package com.cassio.estruturadados.vetor;

public class Vetor {

    private String[] elementos;
    private int posicaoLivreDoVetor;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.posicaoLivreDoVetor = 0;
    }

//    public void adiciona(String elemento) {
//        for (int i = 0; i < this.elementos.length; i++) {
//            if (this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }

//    public boolean adiciona(String elemento) {
//        if (this.posicaoLivreDoVetor < this.elementos.length) {
//            this.elementos[this.posicaoLivreDoVetor] = elemento;
//            this.posicaoLivreDoVetor++;
//            return true;
//        } else {
//            return false;
//        }
//    }

    public void adiciona(String elemento) throws Exception {
        if (this.posicaoLivreDoVetor < this.elementos.length) {
            this.elementos[this.posicaoLivreDoVetor] = elemento;
            this.posicaoLivreDoVetor++;
        } else {
            throw new Exception("O Vetor já está cheio, não é possível adicionar mais elementos");
        }
    }
}
