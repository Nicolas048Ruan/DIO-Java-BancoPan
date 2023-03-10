package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        // Formas de iniciar o Set
//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/

        // Set não repete elementos

        // Usando o HashSet os elementos dentro dele ficam aleatórios 
        HashSet<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

//      Com um set n é possível fazer busca de acordo com a posicão pq ficam d forma aleatória
//      System.out.println("Exiba a posição da nota 5.0: ");

//      N é possível trabalhar com posição em um set
//      System.out.println("Adicione na lista a nota 8.0 na posição 4: ");

//      N é possível pq não tem o método set()
//      System.out.println("Substitua a nota 5.0 pela nota 6.0: ");

//      É possível com o contains() para retornar um boolean
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

//      N tem o metodo get para passar o index
//      System.out.println("Exiba a terceira nota adicionada: ");

        // Possível com as Collections
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // Possível com o iterator
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

//      System.out.println("Remova a nota da posição 0"); Set n trabalha cm posições

        System.out.println("Remova notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) { if (iterator2.next() < 7d) { iterator2.remove(); } }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2.toString()); // Set não repete elementos

        System.out.println("Exiba todas as notas em ordem crescente: ");
        // Deu certo cm o TreeSet pq o notas2 era um Double e no Double tem o Comparable
        // Se não tivesse eu teria que passar o Comparable ou o Comparator
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        /*System.out.println("Apague todo o conjunto: ");
        notas.clear();*/
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty()); // retorna boolean
    }
}
