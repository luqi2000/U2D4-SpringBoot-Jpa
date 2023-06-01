package luqmanmohammad.U2D4SpringBootJpa.entities.toppings;

import luqmanmohammad.U2D4SpringBootJpa.entities.Consummation;

public class HamTopping extends ToppingDecorator {
	public HamTopping(Consummation c) {
		super(c);
		this.name = "Prosciutto";
		this.price = 2.00;
		this.calories = 200;
	}
}