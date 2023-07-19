package practice.authenticationandauthorization.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.authenticationandauthorization.entity.Authority;

import java.util.List;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
    Authority findByUserUsername(String username);
}
