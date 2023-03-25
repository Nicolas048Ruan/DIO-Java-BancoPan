package com.projeto.pilha;

public class Pilha {
    
    private No refNoEntradaPilha;

	public Pilha() { this.refNoEntradaPilha = null; }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha; // Guardei a referência q está no topo
        refNoEntradaPilha = novoNo; // Pego a referência q está no topo e seto como um novoNo
        refNoEntradaPilha.setRefNo(refAuxiliar); // Digo q o No q terminei d empilhar é a antiga referência de topo
    }

    public No pop() {
        if (!this.isEmpty()){ // Se a pilha n estiver vazia
            No noPoped = refNoEntradaPilha; // Guardo o No q estou retirando ele
            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); // Digo q a referência d entrada agr é o No q está abaixo dele
            return noPoped;
        }
        return null;
    }

    public No top() { return refNoEntradaPilha; /* Vai retornar o topo */ }

    public boolean isEmpty() { return refNoEntradaPilha == null ? true : false; }

    
}
