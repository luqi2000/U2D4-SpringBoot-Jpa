package luqmanmohammad.U2D4SpringBootJpa.entities.merchandise;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import luqmanmohammad.U2D4SpringBootJpa.entities.Product;


@Getter
@Setter
@AllArgsConstructor
public class Gadget extends Product {
	String type;
}