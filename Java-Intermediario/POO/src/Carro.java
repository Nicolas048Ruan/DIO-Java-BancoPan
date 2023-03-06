// Atributos - Caracteristicas do objeto a ser criado

// Método - Que ações é possível realizar com a classe

// Construtor - Usando o método construtor q agente vai conseguir criar objetos apartir da nossa
//              classe (semelhante ao def __init__ do python)

// Destrutor - Auxilia na destruição do objeto

// Sobrecarga - Muda a assinatura de acordo com a necessidade ou seja mantem o mesmo método mudando
//              somente a assinatura (assinatura de um método é: nome + parâmentro)

// Set - o set é usado para colocar um valor no atributo
// Get - o get ele retorna o valor do set

public class Carro {

    String cor; // Atributo
    String modelo; // Atributo
    int capacidadeTanque; // Atributo

    Carro(){ // Construtor

    }

    Carro(String cor, String modelo, int capacidadeTanque){ // Construtor com Sobrecarga
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


    public void setCor(String cor) { // Set
        this.cor = cor;
    }

    public String getCor() { // Get
        return cor;
    }

    public void setModelo(String modelo) { // Set
        this.modelo = modelo;
    }

    public String getModelo() { // Get
        return modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque){ // Set
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque(){ // Get
        return capacidadeTanque;
    }


    public double totalValorTanque(double valorCombustivel){ // Método
        return capacidadeTanque * valorCombustivel;
    }
}
