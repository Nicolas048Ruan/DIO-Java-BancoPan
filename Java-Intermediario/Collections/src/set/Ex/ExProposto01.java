package set.Ex;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ExProposto01 {

    public static void main(String[] args) {
        Set<String> corArcoIris = new HashSet<String>();
        corArcoIris.add("violeta");
        corArcoIris.add("anil");
        corArcoIris.add("azul");
        corArcoIris.add("verde");
        corArcoIris.add("amarelo");
        corArcoIris.add("laranja");
        corArcoIris.add("vermelho");
        System.out.println(corArcoIris);
        for (String cor : corArcoIris) { // A
            System.out.println(cor);
        }
        System.out.println("----------------------------------------------------");

        System.out.println(corArcoIris.size()); // B
        System.out.println("----------------------------------------------------");

        Set<String> corArcoIris2 = new TreeSet<String>(); // C
        corArcoIris2.addAll(corArcoIris);
        System.out.println(corArcoIris2);
        System.out.println("----------------------------------------------------");

        List<String> corReversa = new ArrayList<>(corArcoIris);
        System.out.println(corReversa);
        Collections.reverse(corReversa);
        System.out.println(corReversa); // D
        System.out.println("----------------------------------------------------");

        for (String cor : corArcoIris) {
            if (cor.startsWith("v")) { System.out.println(cor); } // E
        }
        System.out.println("----------------------------------------------------");

        Iterator<String> iterator = corArcoIris.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) { iterator.remove(); } // F 
        }
        System.out.println(corArcoIris.toString());

        corArcoIris.clear(); // G
        System.out.println(corArcoIris);

        System.out.println(corArcoIris.isEmpty()); // H
    }
}
