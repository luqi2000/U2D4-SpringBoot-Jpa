package luqmanmohammad.U2D4SpringBootJpa.entities;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
	protected int numOrdine;
	protected StatoOrdine stato;
	
	public enum StatoOrdine{
		INCORSO, PRONTO, SERVITO
	}
	
	protected int numeroCoperti;
	protected LocalTime oraAcquisizione;
	protected double importoTotale;
	
	protected Table table;
	
}
