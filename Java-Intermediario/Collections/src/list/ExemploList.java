package list;

import java.util.*;

class ExemploList {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        // Todos esses comentados não é possivel add ou remover valores da list
//      List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
/*      List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);
*/
/*      List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        // Desse jeito é possível add e remover da list
        List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0); // Adiciona valores
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString()); // Imprime os valores do Arrays

        // Mostra a posição começando a contar pelo 0
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); // Na posição 4 vai adicionar o num 8
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); // Passa a posição e o novo elemento
        System.out.println(notas);

        // Se conter o valor na list então ele retorna true senão false
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        // Usando o for para imprimir
        /*System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);*/

        // Vai exibir a terceira nota começando a contar do 0
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        // N existe método min no List mas existe no Collections
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // Mesma coisa para o max
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // Para somar pq o List n possui método sum
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){ // Enquanto o iterator tiver próximo
            Double next = iterator.next(); // Guarda o próximo iterator em uma variable
            soma += next; // Soma
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        // Usa o size() ao invés de length() no List
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); // Se eu não colocar o d ele vai remover da posição 0 ao invés do num 0
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0); // Agora sem o d vai remover da posição 0
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) { // Faço isso para pessar por tds os valores
            Double next = iterator1.next();
            if(next < 7) iterator1.remove(); // Remove se o valor for menor q 7
        }
        System.out.println(notas);

        /*System.out.println("Apague toda a lista");
        notas.clear(); Para apagar td a List
        System.out.println(notas);
        */
        // Retorna true se estiver vazia e false se não
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        System.out.println("---------------------------------------------------------------------");

        /*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");

        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/
        List<Double> notas2 = new ArrayList<>();
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()) { // Faço isso para pessar por tds os valores
            notas2.add(iterator2.next());
        }
        System.out.println(notas2);
        System.out.println(notas2.get(0));

        for (int i=(notas.size() - 1); i>0; i--){
            notas2.remove(i);
        }
        System.out.println(notas2.toString());
        System.out.println(notas2.size());
        System.out.println(notas2);
    }
}
