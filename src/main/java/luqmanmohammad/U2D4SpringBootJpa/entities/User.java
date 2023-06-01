package luqmanmohammad.U2D4SpringBootJpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@Table(name= "users")
@Getter
@Setter
@ToString
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String surname;
	private String email;
}
