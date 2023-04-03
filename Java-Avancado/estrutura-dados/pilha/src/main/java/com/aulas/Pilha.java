package com.aulas;

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

    @Override
    public String toString() {
        String stringRetorno = "-----------------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "-----------------------\n";

        No noAuxiliar = refNoEntradaPilha; // Recebe o No do topo

        while(true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado= " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo(); // Passa a ser o próximo No
            }else {
                break;
            }
        }
        stringRetorno += "=======================\n";
        return stringRetorno;
    }
}
