package com.projeto.pilha;

public class Pilha {
    
    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        }
        return null;
    }


    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        // if(refNoEntradaPilha == null){
        //     return true;
        // }
        // return false;
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "--------------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "--------------------\n";

        No noAulixiar = refNoEntradaPilha;

        while(true){
            if(noAulixiar != null){
                stringRetorno += "[No{dado=" + noAulixiar.getDado() + "}]\n";
                noAulixiar = noAulixiar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "====================\n";
        return stringRetorno;
    }

}
