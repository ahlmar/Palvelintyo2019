package k2019.Salesteam.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String firstName, lastName, email, title;
	private int salary, sales;
	
	
	
	
}
