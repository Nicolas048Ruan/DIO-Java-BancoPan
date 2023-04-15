package com.aula;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if(atual == null) {
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) { // menor: -1, igual: 0, maior: 1
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem() {
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    public void exibirInOrdem(BinNo<T> atual) {
        if(atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem() {
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    public void exibirPosOrdem(BinNo<T> atual) {
        if(atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem() {
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    public void exibirPreOrdem(BinNo<T> atual) {
        if(atual != null) {
            System.out.println(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }
}
