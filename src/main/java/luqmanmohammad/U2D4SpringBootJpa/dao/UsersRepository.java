package luqmanmohammad.U2D4SpringBootJpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luqmanmohammad.U2D4SpringBootJpa.entities.User;

@Repository
public interface UsersRepository extends JpaRepository<User,Integer>{
}
