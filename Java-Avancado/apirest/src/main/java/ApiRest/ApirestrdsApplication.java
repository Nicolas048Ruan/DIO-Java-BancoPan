package ApiRest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.dioclass.apirest.Person;
import com.example.dioclass.apirest.PersonRepository;

@SpringBootApplication
public class ApirestrdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestrdsApplication.class, args);
	}

}