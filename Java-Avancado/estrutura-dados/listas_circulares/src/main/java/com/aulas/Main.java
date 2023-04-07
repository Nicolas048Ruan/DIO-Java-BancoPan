package com.aulas;

public class Main {
    
    public static void main(String[] args) {
        
        ListaCircular<String> minhListaCircular = new ListaCircular<>();

        minhListaCircular.add("c0");
        System.out.println(minhListaCircular);

        minhListaCircular.remove(0);
        System.out.println(minhListaCircular);

        minhListaCircular.add("c1");
        System.out.println(minhListaCircular);

        minhListaCircular.add("c2");
        minhListaCircular.add("c3");
        System.out.println(minhListaCircular);

        // System.out.println(minhListaCircular.get(0));
        // System.out.println(minhListaCircular.get(1));
        // System.out.println(minhListaCircular.get(2));
        // System.out.println(minhListaCircular.get(3));
        // System.out.println(minhListaCircular.get(4));

        for (int i=0; i<20; i++) {
            System.out.println(minhListaCircular.get(i));
        }

    }
}
