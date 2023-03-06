// Objeto - É a representação de um conceito/entidade do mundo real, que pode ser física 
//          (bola, carro árvore etc.) ou conceitual (viagem, estoque, compra etc.)

public class RodarAplicacao {
    
    public static void main(String[] args) {
        
        Carro carro1 = new Carro(); // Objeto

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        // Sem usar o set
        Carro carro2 = new Carro("Cinza", "Mercedez-Benz Classe C", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}
