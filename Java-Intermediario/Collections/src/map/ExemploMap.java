package map;

import java.util.*;
import java.util.Map.Entry;

/*
 * O Map é um objeto q dentro desse objeto vc pode colocar múltiplos 
 * elementos (tanto objetos quanto variáveis primitivas), cada elemento dentro do Map tem 
 * chaves únicas (n pode repetir) e valores (pode repetir).
 * 
 * No Map o método add não existe, então vc passa o put
 */

/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

class ExemploMap {

    public static void main(String[] args) {
        
        // Outras formas de iniciar

//      Map carrosPopulares2020 = new HashMap(); //antes do java 5
//      Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//      HashMap<String, Double> carrosPopulares = new HashMap<>();
//      Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
    //  Map  Key    Value
        Map<String, Double> carrosPopulares = new HashMap<String, Double>(){{ // HashMap deixa aleatório
//          No Map o método add não existe, então vc passa o put e n pode ter keys iguais
            put("gol", 14.4); // Key: Marca do carro | Value: valor de consumo
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2); // Pode alterar pq a chave já existe
        System.out.println(carrosPopulares);

        // tucson é a chave, então usa o containsKey("tucson"), ele vai retorna um boolean
        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        // Usando o get vc passa a key e ele mostra o valor
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        // System.out.println("Exiba o terceiro modelo adicionado: "); N tem método para isso

        System.out.println("Exiba os modelos: "); // Exiba as keys
        // retorna um Set por isso está na variável
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: "); // Exiba os values
        // retorna uma Collection por isso está na variável
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        // retorna o value maximo de carrosPopulares
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());

        // retorna um Set do tipo Entry
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }


        System.out.println("Exiba o modelo com o menor consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        // Teve q colocar .iterator() pq ele retornaria um Collection
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }   
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));

        System.out.println(carrosPopulares);

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) { iterator1.remove(); }
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<String, Double>(){{
//          No Map o método add não existe, então vc passa o put e n pode ter keys iguais
            put("gol", 14.4); // Key: Marca do carro | Value: valor de consumo
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicis onário ordenado pelo modelo: "); // Ordem Alfabética
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());

    }
} 

