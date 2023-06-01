package luqmanmohammad.U2D4SpringBootJpa.entities.drinks;

public class Lemonade extends Drink {
	public Lemonade(double size) {
		super(size);
		this.calories = 100;
		this.name = "Limonata";
		this.price = 3.00;
	}
}