package test.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Robot {
	/**
	 * id long
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private long id;
	/**
	 * name String
	 */
	@Getter
	@Setter
	private String name;
	/**
	 * description String
	 */
	@Getter
	@Setter
	private String description;


}
