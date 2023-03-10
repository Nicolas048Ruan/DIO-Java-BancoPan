package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

public class ExemploOrdenacaoSet {
    
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<Serie>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }}; // Com o HashSet fica em ordem aleatória
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries2 = new LinkedHashSet<Serie>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }}; // Com o LinkedHashSet fica na ordem que foi colocada
        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        // Tive q implementar o Comparable na class Serie
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);
        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisódio\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries4.addAll(minhasSeries); // Adiciona td na collection de uma vez
        for (Serie serie : minhasSeries4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


        //Pra você
/*        System.out.println("--\tOrdem gênero\t--");
          System.out.println("--\tOrdem Tempo Episódio\t--");
 */
        System.out.println("--\tOrdem gênero\t--");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGenero());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie : minhasSeries5) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


        System.out.println("--\tOrdem Tempo Episódio\t--");
        Set<Serie> minhasSeries6 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries6.addAll(minhasSeries);
        for (Serie serie : minhasSeries6) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }
}


class Serie implements Comparable<Serie>{

    // Atributos
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    // Construtor
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    // Métodos Getters
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    // Método toString
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    // Verifica se tem o hashCode dentro da class
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Serie serie = (Serie) obj;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

     // Faz as comparações
    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    // Método para comparar se são iguais
    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        // Se tempoEpisodio forem diferentes retorna por de tempoEpisodio
        if (tempoEpisodio != 0) return tempoEpisodio;
        else return this.getGenero().compareTo(serie.getGenero()); // Senão retorna por Gênero
    }
}


class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome; // Se nomes forem diferentes, então compara por nome
        
        // Senão se nomes forem iguais
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero; // Se genero forem diferentes, então compara por genero

        // Senão se nomes forem iguais e generos forem iguais
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio()); // Compara tempoEpisodio
    }
}


// Exercícios
class ComparatorGenero implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getGenero().compareTo(s2.getGenero());
    }
}

class ComparatorTempoEpisodio implements Comparator<Serie> {
    
    @Override
    public int compare(Serie s1, Serie s2) {
        int TempoEpisodio = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        if (TempoEpisodio != 0) return TempoEpisodio; // Se nomes forem diferentes, então compara por nome
        
        // Senão se nomes forem iguais
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero; // Se genero forem diferentes, então compara por genero

        // Senão se nomes forem iguais e generos forem iguais
        return s1.getNome().compareTo(s2.getNome()); // Compara tempoEpisodio
    }
}
