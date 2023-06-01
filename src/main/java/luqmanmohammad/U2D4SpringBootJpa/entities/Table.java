package luqmanmohammad.U2D4SpringBootJpa.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Table {
	protected int numero;
	protected int numMaxCoperti;
	protected Stato stato;
	
	public enum Stato{
		OCCUPATO, LIBERO
	}

}
