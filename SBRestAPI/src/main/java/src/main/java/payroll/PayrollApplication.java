package src.main.java.payroll;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayrollApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(PayrollApplication.class);
		Map<String, Object> properties = new HashMap<String,Object>();
		properties.put("server.port", "12345");
		app.setDefaultProperties(properties);
		app.run(args);

	}

}
