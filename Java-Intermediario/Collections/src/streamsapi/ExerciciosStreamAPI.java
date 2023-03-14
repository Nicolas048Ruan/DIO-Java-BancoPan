package streamsapi;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    
    public static void main(String[] args) {
        List<String> numAleatorios =
            Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");


//      System.out.println("Imprima todos os elementos da Lista: ");

/*      numAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        });*/ //Sem o Lambda
//      numAleatorios.stream().forEach(s -> System.out.println(s)); // Com Lambda e o .stream()
//      numAleatorios.forEach(s -> System.out.println(s)); // Com Lambda sem o .stream()
//      numAleatorios.forEach(System.out::println); // Com Lambda e Method Reference


//      System.out.println("Coloque os 5 primeiros números dentro de um Set: ");

//      numAleatorios.stream().limit(5) // O .limit() vai pegar da posição 5 pra frente
//      .collect(Collectors.toSet()) // Vai coletar o valor e colocar em um Set
//      .forEach(System.out :: println); // lambda method reference


//      System.out.println("Tranforme essa lista de String em ums lista de Integer: ");

//      numAleatorios.stream().map(s -> Integer.parseInt(s)); // lambda
//      List<Integer> collectList = numAleatorios.stream()
//          .map(Integer :: parseInt) // N é o Map d Collections
 //         .collect(Collectors.toList()); // Vai coletar e mandar para uma List


//      System.out.println("Pegue números pares e maiores que 2 e coloque em uma lista: ");

/*      List<Integer> lista = numAleatorios.stream().map(Integer::parseInt)
        //     .filter(new Predicate<Integer>() {
        //         @Override
        //         public boolean test(Integer i){
        //             if (i % 2 == 0 && i >2) return true;
        //             return false;
        //         } 
        //     }).collect(Collectors.toList());*/ // Sem lambda
//      List<Integer> lista = numAleatorios.stream().map(Integer::parseInt)
//          .filter(i -> (i % 2 == 0 && i >2)) // Com lambda
//          .collect(Collectors.toList());
//      System.out.println(lista);


//      System.out.println("Mostre a média dos números: ");

/*      numAleatorios.stream().mapToInt(new ToIntFunction<String>() {
            @Override
            public int applyAsInt(String s) {
                return Integer.parseInt(s);
            }
        }); */
//      numAleatorios.stream().mapToInt(Integer::parseInt)
//          .average().ifPresent(System.out::println);


//      System.out.println("Revoma os valores ímpares: ");
//      List<Integer> numsAleatoriosInteger = numAleatorios.stream()
//          .map(Integer::parseInt)
//          .collect(Collectors.toList());
//      numsAleatoriosInteger.removeIf(i -> (i % 2 != 0));
//      System.out.println(numsAleatoriosInteger);


        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numAleatorios.stream().skip(3).forEach(System.out::println);

        System.out.println("------------------------------------------------");

        long countNumerosUnicos = numAleatorios.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.println("------------------------------------------------");

        System.out.print("Mostre o menor valor da lista: ");
        numAleatorios.stream().mapToInt(Integer::parseInt).min().ifPresent(System.out::println);

        System.out.println("------------------------------------------------");

        System.out.print("Mostre o maior valor da lista: ");
        numAleatorios.stream().mapToInt(Integer::parseInt).max().ifPresent(System.out::println);

        System.out.println("------------------------------------------------");

        int somaDosNumerosPares = numAleatorios.stream()
            .mapToInt(Integer::parseInt)
            .filter(i -> ( i % 2 == 0))
            .sum();
        System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);

        System.out.println("------------------------------------------------");

        System.out.println("Mostre a lista na ordem númerica: ");
        numAleatorios.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("------------------------------------------------");

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> multiplos3E5 = numAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.groupingBy(i -> (i % 3== 0 || i % 5 == 0)));
        System.out.println(multiplos3E5);        
    }
}
