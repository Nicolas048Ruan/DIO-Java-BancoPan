package com.aula;

import com.aula.model.Obj;

public class Main {

    public static void main(String[] args) {
    
        ArvoreBinaria<Obj> minhArvore = new ArvoreBinaria<>();

        minhArvore.inserir(new Obj(13));
        minhArvore.inserir(new Obj(10));
        minhArvore.inserir(new Obj(25));
        minhArvore.inserir(new Obj(2));
        minhArvore.inserir(new Obj(12));
        minhArvore.inserir(new Obj(20));
        minhArvore.inserir(new Obj(31));
        minhArvore.inserir(new Obj(29));
        minhArvore.inserir(new Obj(32));

        minhArvore.exibirInOrdem();
        minhArvore.exibirPreOrdem();
        minhArvore.exibirPosOrdem();

    }
}
