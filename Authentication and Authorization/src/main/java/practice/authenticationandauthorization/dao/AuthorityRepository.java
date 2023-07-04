package practice.authenticationandauthorization.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.authenticationandauthorization.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
