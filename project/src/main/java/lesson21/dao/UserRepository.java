package lesson21.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lesson21.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findByEmail(String email);
}