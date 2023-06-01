package luqmanmohammad.U2D4SpringBootJpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import luqmanmohammad.U2D4SpringBootJpa.configs.MenuConfig;
import luqmanmohammad.U2D4SpringBootJpa.entities.Menu;

@Component
public class MenuRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
		System.out.println("Benvenuto");
		Menu menu = ctx.getBean(Menu.class);

		menu.print();

		ctx.close();

	}

}