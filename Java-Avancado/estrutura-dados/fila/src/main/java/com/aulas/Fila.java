package com.aulas;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    // Enfileirar, Adicionado no final da fila e a referência do No passa a apontar pra ele
    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    // Desenfileirar, tira o primeiro da fila e faz o próximo apontar pra null
    public T dequeue(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){
              if(primeiroNo.getRefNo() != null) {
                  noAuxiliar = primeiroNo;
                  primeiroNo = primeiroNo.getRefNo();
              }else{
                  noAuxiliar.setRefNo(null);
                  break;
              }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    // Mostra o primeiro da fila
    public T first(){
        if(!isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    // Verifica se está vazio e retorna um boolean
    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject() +"}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
