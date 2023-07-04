package practice.authenticationandauthorization.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.authenticationandauthorization.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
}
