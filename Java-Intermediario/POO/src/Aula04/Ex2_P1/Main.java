// Herança - A herança é para criar subtipos, tipos mais especificos apartir da classe herdada
//           (membros são atributos e métodos)

// Upcast - Quando vc coloca o objeto do tipo da super classe, mas ele herda uma sub-classe

// Downcast - Quando vc coloca o objeto como uma sub-classe, mas herda ele como uma super classe

// Polimorfismo - A mesma ação, sempre se comportando diferente

// Sobrescrita - A mesma ação, podendo ou não se comportar diferente

package Aula04.Ex2_P1;

public class Main {
    
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); // Objeto
        
        Funcionario gerente = new Gerente(); // Upcast
        Funcionario vendedor = new Vendedor(); // Upcast
        Funcionario faxineiro = new Faxineiro(); // Upcast

        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario(); // Downcast
    }
}
