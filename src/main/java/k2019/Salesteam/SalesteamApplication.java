package k2019.Salesteam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalesteamApplication {
	private static final Logger log = LoggerFactory.getLogger(SalesteamApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SalesteamApplication.class, args);
	}

	@Bean
	public CommandLineRunner teamDemo(teamRepository) repository {
		return (args) -> {
			log.info("Saving some team members");
			repository.save(new Member("Marcus", "Ahlfors", "marcus.ahlfors@gmail.com", "Sr Sales rep", 5000, 100000));
			
		
		
		};
	}
	


