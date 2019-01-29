package k2019.Salesteam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalesteamApplication {
	private static final Logger log = LoggerFactory.getLogger(SalesteamApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SalesteamApplication.class, args);
	}

}

