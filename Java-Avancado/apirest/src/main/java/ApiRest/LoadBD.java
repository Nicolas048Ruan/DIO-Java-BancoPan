package ApiRest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBD {
    
    CommandLineRunner commandLineRunner(EmployeeRepository repository) {
        return args -> {
            Log.info("Log of event save user 1: "+ employeeRepository.save(new Employee("MAria Silva", "Teste", "teste")));
        };
    }

}
