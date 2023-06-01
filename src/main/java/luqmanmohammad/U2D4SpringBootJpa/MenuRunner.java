package luqmanmohammad.U2D4SpringBootJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import luqmanmohammad.U2D4SpringBootJpa.configs.MenuConfig;
import luqmanmohammad.U2D4SpringBootJpa.dao.UsersService;
import luqmanmohammad.U2D4SpringBootJpa.entities.Menu;
import luqmanmohammad.U2D4SpringBootJpa.entities.User;
import luqmanmohammad.U2D4SpringBootJpa.exceptions.ItemNotFoundException;

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
		
		//this new object will be modify aldo object from the table with method findByIDAndUpdate
		User giovanni = new User();
		giovanni.setEmail("giovanni@gmail.com");
		giovanni.setName("giovanni");
		giovanni.setSurname("treviso");
		

		
		//find all user
		System.out.println("find all users");
		usersService.find().forEach(user -> System.out.println(user));
		
		//findById
		System.out.println("find by id");
		try{
			System.out.println(usersService.findByID(5));
		}catch(ItemNotFoundException e){
			System.out.println(e);
		}
		
		
		//find By Id And Update
		System.out.println("find by id and Update");
		try{
			usersService.findByIdAndUpdate(4,giovanni); //table with id 4 will be modify with object giovanni
			System.out.println(usersService.findByID(4));
		}catch(ItemNotFoundException e){
			System.out.println(e);
		}
		
	}

}