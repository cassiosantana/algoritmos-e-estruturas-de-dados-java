package com.cassio.estruturadados.vetor;


public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento) {
        this.aumentacapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public void adiciona(int posicao, String elemento) {
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
            String[] novoVetor = new String[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                novoVetor[i] = this.elementos[i];
            }
            this.elementos = novoVetor;
        }
    }

    // B G D E F -> remover posição 1(G)
    // 0 1 2 3 4 -> tamanho é 5
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]
    // B D E F F
    // 0 1 2 3 4
    public void remove(int posicao) {
        if (!(posicao < this.tamanho && posicao >= 0)) {
            throw new IllegalStateException("Posição inválida");
        }
        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public String busca(int posicao) {
        if (!(posicao < this.tamanho && posicao >= 0)) {
            throw new IllegalStateException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento) {
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

    //    public void adiciona(String elemento) {
//        for (int i = 0; i < this.elementos.length; i++) {
//            if (this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }

//    public void adiciona(String elemento) throws Exception {
//        if (this.tamanho < this.elementos.length) {
//            this.elementos[this.tamanho] = elemento;
//            this.tamanho++;
//        } else {
//            throw new Exception("O Vetor já está cheio, não é possível adicionar mais elementos");
//        }
//    }
}
