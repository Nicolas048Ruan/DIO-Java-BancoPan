package com.projeto.conceito_encadeamento_no;

public class No {
    
    private String conteudo;
    private No proximoNo;

    public No(String conteudo){
        this.proximoNo = null; // Para garabtir que o último nó será null
        this.conteudo = conteudo;
    }

    public String getConteudo() { return conteudo; }

    public void setConteudo(String conteudo) { this.conteudo = conteudo; }

    public No getProximoNo() { return proximoNo; }

    public void setProximoNo(No proximoNo) { this.proximoNo = proximoNo; }

    @Override
    public String toString() {
        return "No{" +
                "conteudo= '" + conteudo + '\'' +
                "}";
    }
}
