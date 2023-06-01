package luqmanmohammad.U2D4SpringBootJpa.exceptions;

public class ItemNotFoundException extends RuntimeException {
	
	public ItemNotFoundException() {
		super("Item not found");
	}

	public ItemNotFoundException(int id) {
		super("Item with id " + id + " not found");
	}
}
