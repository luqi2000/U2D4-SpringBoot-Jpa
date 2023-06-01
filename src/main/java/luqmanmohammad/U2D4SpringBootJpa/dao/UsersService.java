package luqmanmohammad.U2D4SpringBootJpa.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import luqmanmohammad.U2D4SpringBootJpa.entities.User;
import luqmanmohammad.U2D4SpringBootJpa.exceptions.ItemNotFoundException;

@Service
public class UsersService {
	@Autowired
	private UsersRepository usersRepo;
	
	public void create(User u) {
		//custom logic
		usersRepo.save(u);
	}
	
	public List<User> find(){
		return usersRepo.findAll();
	}
	
//	public Optional<User> findById(int id) {
//		return usersRepo.findById(id);
//	}
	
	//better method
	public User findByID(int id) {
//		Optional<User> found = usersRepo.findById(id);
//		if (found.isPresent()) {
//			return found.get();
//		}else {
//			throw new ItemNotFoundException(id);
//		}
		
		//another method version compat
		return usersRepo.findById(id).orElseThrow(()-> new ItemNotFoundException(id));
	}
	
	
	public void findByIdAndUpdate(int id, User u) throws ItemNotFoundException {

		User found = this.findByID(id);
		found.setId(id);
		found.setName(u.getName());
		found.setSurname(u.getSurname());
		found.setEmail(u.getEmail());
		usersRepo.save(found);
	}
	
//	public User findByName(String name) throws ItemNotFoundException {
//		return usersRepo.findByName(name).orElseThrow(() -> new ItemNotFoundException());
//	}
	
}
