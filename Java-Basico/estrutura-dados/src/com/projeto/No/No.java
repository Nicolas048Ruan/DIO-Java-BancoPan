package com.projeto.No;

// Esse <T> é para a Refatoração, usando a refatoração não é necessário declarar o tipo
// da class se ela é int String entre outros

/*
 * Convenção
 * 
 * K para "Key", ex: Map<K,V>
 * V para "Value", ex: Map<K,V>
 * E para "Element", ex: List<E>
 * T para "Type", ex: Collections#addAll
 * ? quando genérico
 */

public class No<T> {
    
    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() { return conteudo; }

    public void setConteudo(T conteudo) { this.conteudo = conteudo; }

    public No<T> getProximoNo() { return proximoNo; }

    public void setProximoNo(No<T> proximoNo) { this.proximoNo = proximoNo; }

    @Override
    public String toString() {
        return "No{" +
                "conteudo= '" + conteudo + '\'' +
                "}";
    }
}
