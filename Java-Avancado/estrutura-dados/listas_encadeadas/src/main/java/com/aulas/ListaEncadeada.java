package com.aulas;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(No<T> referenciaEntrada) {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo) { // Adiciona um novo No na Lista
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i=0; i<this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);

    }

    public int size() { // Retorna tamanho da lista
        int tamanhoLista = 0;

        No<T> referenciaAux = referenciaEntrada;

        while(true) {
            if (referenciaAux != null) {
                
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }

            } else {
                break;
            }
        }

        return tamanhoLista;
    }

    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

}
