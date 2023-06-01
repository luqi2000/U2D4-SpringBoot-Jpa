package luqmanmohammad.U2D4SpringBootJpa.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import luqmanmohammad.U2D4SpringBootJpa.entities.User;

@Service
public class UsersService {
	@Autowired
	private UsersRepository usersRepo;
	
	public void create(User u) {
		//logica custom
		usersRepo.save(u);
	}
	
	public List<User> find(){
		return usersRepo.findAll();
	}
	
	public Optional<User> findById(int id) {
		return usersRepo.findById(id);
	}
}
