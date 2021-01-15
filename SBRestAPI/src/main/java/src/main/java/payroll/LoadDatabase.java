package src.main.java.payroll;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
	
	@Bean
	CommandLineRunner iniDatabase(EmployeeRepository repository) {
		return args -> {
			repository.save(new Employee("Bilbo Baggins", "burglar"));
			repository.save(new Employee("Frodo Baggins", "thief"));
		};
	}
}
