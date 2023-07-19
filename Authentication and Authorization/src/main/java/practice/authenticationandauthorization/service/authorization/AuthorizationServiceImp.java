package practice.authenticationandauthorization.service.authorization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.authenticationandauthorization.dao.AuthorityRepository;
import practice.authenticationandauthorization.entity.Authority;

import java.util.Optional;

@Service
public class AuthorizationServiceImp implements AuthorizationService {
    @Autowired
    AuthorityRepository authorityRepository;

    @Override
    public Authority getAuthority(String username) {
        Authority authority = null;
        Optional<Authority> optionalAuthority = authorityRepository.findById(username);
        if (optionalAuthority.isPresent()) {
            authority = optionalAuthority.get();
            return authority;
        }
        return authority;
    }
}
