package dio.springboot;

import org.springframework.stereotype.Component;

@Component // Necessario para executar no MyApp
public class Calculadora {

    public int somar(int n1, int n2) {
        return n1 + n2;
    }
    
}
