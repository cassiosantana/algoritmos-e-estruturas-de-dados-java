package com.cassio.estruturadados.vetor;

public class VetorObjetos {

    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento) {
        this.aumentacapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public void adiciona(int posicao, Object elemento) {
        if (!(posicao < this.tamanho && posicao >= 0)) {
            throw new IllegalStateException("Posição inválida");
        }

        this.aumentacapacidade();

        for (int i = this.tamanho; i > posicao; i--) {
            this.elementos[i] = this.elementos[i - 1];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    public void aumentacapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] novoVetor = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                novoVetor[i] = this.elementos[i];
            }
            this.elementos = novoVetor;
        }
    }

    public void remove(int posicao) {
        if (!(posicao < this.tamanho && posicao >= 0)) {
            throw new IllegalStateException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public Object busca(int posicao) {
        if (!(posicao < this.tamanho && posicao >= 0)) {
            throw new IllegalStateException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }
}
