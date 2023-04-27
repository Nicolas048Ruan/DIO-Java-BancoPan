package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // Necessário para executar na Calculadora
public class MyApp implements CommandLineRunner {

    @Autowired // Substitui o new
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Resultado: " + calculadora.somar(2, 7));
    }
    
}
