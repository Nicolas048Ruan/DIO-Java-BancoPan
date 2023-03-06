// Herança - A herança é para criar subtipos, tipos mais especificos apartir da classe herdada
//           (membros são atributos e métodos)

// Upcast - Quando vc coloca o objeto do tipo da super classe, mas ele herda uma sub-classe

// Downcast - Quando vc coloca o objeto como uma sub-classe, mas herda ele como uma super classe

// Polimorfismo - A mesma ação, sempre se comportando diferente

// Sobrescrita - A mesma ação, podendo ou não se comportar diferente

package Aula04.Ex2_P2;

public class Main {
    
    public static void main(String[] args) {
        
        // Polimorfismo
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe : classes){
            classe.metodo1();
        }
        System.out.println();

        for (ClasseMae classe : classes){
            classe.metodo2();
        }
        System.out.println();

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
