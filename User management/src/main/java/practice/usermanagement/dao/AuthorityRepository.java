package practice.usermanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.usermanagement.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
    public void deleteByUsername(String username);
}
