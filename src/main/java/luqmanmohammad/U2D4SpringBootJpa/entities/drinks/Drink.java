package luqmanmohammad.U2D4SpringBootJpa.entities.drinks;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import luqmanmohammad.U2D4SpringBootJpa.entities.Consummation;

@AllArgsConstructor
@Getter
@Setter
public abstract class Drink extends Consummation {
	double size;

	public String toString() {
		return this.getName() + " " + this.getSize() + ", prezzo: " + this.getPrice() + "€, calorie:"
				+ this.getCalories();
	}
}

