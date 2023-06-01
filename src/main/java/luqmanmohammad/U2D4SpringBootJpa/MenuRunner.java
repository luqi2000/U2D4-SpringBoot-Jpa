package luqmanmohammad.U2D4SpringBootJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import luqmanmohammad.U2D4SpringBootJpa.configs.MenuConfig;
import luqmanmohammad.U2D4SpringBootJpa.dao.UsersService;
import luqmanmohammad.U2D4SpringBootJpa.entities.Menu;
import luqmanmohammad.U2D4SpringBootJpa.entities.User;

@Component
public class MenuRunner implements CommandLineRunner {
	@Autowired
	UsersService usersService;
	
	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
		System.out.println("Benvenuto");
		Menu menu = ctx.getBean(Menu.class);

		menu.print();

		ctx.close();
		
		
		
		User aldo = new User();
		aldo.setEmail("aldo@gmail.com");
		aldo.setName("aldo");
		aldo.setSurname("baglio");
		
		//usersService.create(aldo);
		
		System.out.println("find all users");
		usersService.find().forEach(user -> System.out.println(user));

	}

}