package practice.authenticationandauthorization.service.authentication;

import practice.authenticationandauthorization.entity.Authority;
import practice.authenticationandauthorization.entity.User;

import java.util.List;

public interface AuthenticationService {
    public User getUserByUsername(String username);

    public boolean authenticate(String username, String password);

    public boolean logout(String username);

}
