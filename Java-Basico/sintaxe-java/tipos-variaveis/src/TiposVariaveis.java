public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        String nome = "Nicolas";

        char sexo = 'M';

        boolean logico = false; // or true

        double salarioMinimo = 2500.0;

        float salarioHora = 7.21f;

        long numeroLongo = 123456789L;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // final tem que se escrito em caixa alta
        
        System.out.println(VALOR_DE_PI);
    }
}
