package luqmanmohammad.U2D4SpringBootJpa.entities.drinks;

public class Coke extends Drink {
	public Coke(double size) {
		super(size);
		this.calories = 300;
		this.name = "Coca cola";
		this.price = 3.00;
	}
}