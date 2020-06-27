package com.fahrul.springloggingsl4j;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringLoggingSl4jApplication {
	


	Logger log = LoggerFactory.getLogger(SpringLoggingSl4jApplication.class);
	
	
	@GetMapping("/test/{name}")
	public String greeting(@PathVariable String name) {
		log.debug("Request {}",name);
		if(name.equalsIgnoreCase("test")) {
			throw new RuntimeException("Exception raised...");
		}
		String respone = "Hi " +name + " Welcome to Istimiwir";
		log.debug("Respone {}",respone);
		return respone;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLoggingSl4jApplication.class, args);
	}

}
