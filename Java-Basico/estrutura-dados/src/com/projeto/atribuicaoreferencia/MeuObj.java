package com.projeto.atribuicaoreferencia;

import java.beans.ConstructorProperties;
import java.lang.reflect.Constructor;

public class MeuObj {

    Integer num;

    public MeuObj(Integer num){ // Construtor
        this.num = num;
    }

    public void setNum(Integer num){ // Mudar número
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }

}
