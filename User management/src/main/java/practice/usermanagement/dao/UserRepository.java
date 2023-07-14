package practice.usermanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.usermanagement.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    public void deleteByUsername(String username);
}
