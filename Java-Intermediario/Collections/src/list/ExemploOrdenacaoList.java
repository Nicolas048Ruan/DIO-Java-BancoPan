package list;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Class Main
public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        // Criei o objeto meusGatos já passando os parâmetros
        List<Gato> meusGatos = new ArrayList<Gato>(){{
            add(new Gato("Jon", 12, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 18, "amarelo"));
        }};

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos); // Bagunça a ordem da list de forma aleatória
        System.out.println(meusGatos);

        // Usa sort() pq o comparator retorna 0, 1 ou -1 e o sort deixa em ordem

        System.out.println("--\tOrdem Natural (Nome)\t---");
        // Estou ordenando usando o Collections.sort() pq implementei o comparable na class Gato
        Collections.sort(meusGatos);
        System.out.println(meusGatos);


        // Como já sobresescreveu o Comparable, então tem q usar o Comparator

        // Compara idade do menor para maior
        System.out.println("--\tOrdem Idade\t---");
//      Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);


        // Compara cor por ordem Alfabética
        System.out.println("--\tOrdem cor\t---");
//      Collections.sort(meusGatos, new ComparatorCor()); Cm Collections ou cm o Objeto. EX abaixo
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);


        // Compara nome por ordem alfabética, se forem iguais;
        // Compara cor por ordem alfabética, se forem iguais;
        // Compara idade por ordem crescente, se forem iguais;
        // Ele retorna  do jeito q está
        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
//      Collections.sort(meusGatos, new ComparatorNomeCorIdade()); Cm Collections ou cm o Objeto. EX abaixo
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

// Class Gato
class Gato implements Comparable<Gato>{ // Implementei o Comparable para comparar valores da List
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
    // O compareToIgnoreCase retorna um int 0 , 1 ou -1
    // 0 é pq o nome do gato q estou comparando cm o próximo da lista tem os nomes são iguais;
    // 1 é pq é maior que o gato q estou comparando;
    // -1 é pq é menor que o gato q estou comparando
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

// Como já sobresescreveu o Comparable, então tem q usar o Comparator

// Class Comparar Idade
class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        // Vai retornar 0 , 1 ou -1
        return Integer.compare(g1.getIdade(), g2.getIdade()); // Vai comparar Gato1 cm Gato2
    }
}

// Class Comparar Cor
class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
    // Aq é a mesma coisa q o compareTo da class Gato, só q aq n usa o this pq n estamos na class Gato
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

// Class Comparar por Nome dps Cor e dps Idade
class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome()); // Vai retornar 0 , 1 ou -1
        if (nome != 0) return nome; // Se for diferente de 0 (n forem iguais) vai ordenar por nome

        // Se nomes forem iguais e cores diferentes
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor()); // Vai retornar 0 , 1 ou -1
        if(cor !=0) return cor; // Ordena por cor

        // Se nomes forem iguais e cores forem iguais
        return Integer.compare(g1.getIdade(), g2.getIdade()); // Ordena por idade

    }
}
