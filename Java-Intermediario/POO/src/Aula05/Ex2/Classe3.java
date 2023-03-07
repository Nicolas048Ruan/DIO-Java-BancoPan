// Visibilidade - Um modificador de acesso que tem como finalidade determinar até que
//                ponto uma classe, atributo ou método pode ser usado
//                Private - Só mostra oq está dentro da classe private para ela mesma
//                Protected - Somente dentro dela mesma, de classes herdadas ou dentro do mesmo pacote
//                Public - Visível em qualquer lugar

package Aula05.Ex2;

public class Classe3 {
    
    Classe1 classe1;

    void metodo(){
     
        // Tem acesso somente ao atributo2 e atributo3, e ao metodo2 e metodo3

    }

}
