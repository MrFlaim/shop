package practice.authenticationandauthorization.service.authorization;

import jakarta.persistence.OneToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.authenticationandauthorization.dao.AuthorityRepository;
import practice.authenticationandauthorization.entity.Authority;

import java.util.Optional;

@Service
public class AuthorizationServiceImp implements AuthorizationService {
    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public Authority getAuthority(String username) {
        return authorityRepository.findByUserUsername(username);
    }
}
