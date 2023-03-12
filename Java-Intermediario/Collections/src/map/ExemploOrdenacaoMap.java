package map;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

import java.util.*;
import java.util.Map.Entry;

public class ExemploOrdenacaoMap {
    
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem aleatória\t--");
        
    //  Map  Key    Value
        Map<String, Livro> meusLivros = new HashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah1", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("--\tOrdem Inserção\t--");
        //  Map  Key    Value
        Map<String, Livro> meusLivros1 = new LinkedHashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah1", new Livro("21 Lições Para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro1 : meusLivros1.entrySet()){
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());
        }


        System.out.println("--\tOrdem Alfabética autores\t--");
    //  Map  Key    Value
        Map<String, Livro> meusLivros2 = new TreeMap<String, Livro>(meusLivros1);
        for (Map.Entry<String, Livro> livro2 : meusLivros2.entrySet()){
            System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());
        }


        System.out.println("--\tOrdem Alfabética nomes dos livros\t--");
         // o Set pq com ele vou poder ordenar na ordem alfabética dos nomes dos livros
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros1.entrySet());
        for (Map.Entry<String, Livro> livro3 : meusLivros3){
            System.out.println(livro3.getKey() + " - " + livro3.getValue().getNome());
        }


        System.out.println("--\tOrdem número de página\t--"); // Pra você
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNumPag());
        meusLivros4.addAll(meusLivros1.entrySet());
        for (Map.Entry<String, Livro> livro4 : meusLivros4){
            System.out.println(livro4.getKey() + " - " + livro4.getValue().getPaginas());
        }

    }
}


class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Livro livro = (Livro) obj;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" + 
                "nome=" + nome + 
                ", paginas=" + paginas + 
                '}';
    }
}


class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }


}


class ComparatorNumPag implements Comparator<Map.Entry<String, Livro>> { // Pra você
    
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}

