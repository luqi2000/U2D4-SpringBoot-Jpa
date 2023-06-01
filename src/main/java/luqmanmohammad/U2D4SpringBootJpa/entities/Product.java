package luqmanmohammad.U2D4SpringBootJpa.entities;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product {
	protected double price;
	protected String name;
}