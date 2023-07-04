package practice.authenticationandauthorization.service.authorization;

import practice.authenticationandauthorization.entity.Authority;

public interface AuthorizationService {
    public Authority getAuthority(String username);
}
