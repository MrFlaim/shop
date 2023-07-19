package practice.authenticationandauthorization.service.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.authenticationandauthorization.dao.UserRepository;
import practice.authenticationandauthorization.entity.Authority;
import practice.authenticationandauthorization.entity.User;

import java.util.Optional;

@Service
public class AuthenticationServiceImp implements AuthenticationService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserByUsername(String username) {
        User user = null;
        Optional<User> optionalUser = userRepository.findById(username);
        if (optionalUser.isPresent()) {
            user = optionalUser.get();
            return user;
        }
        return user;
    }

    @Override
    public boolean authenticate(String username, String password) {
        Optional<User> optionalUser = userRepository.findById(username);
        if (optionalUser.isPresent()) {
            return optionalUser.get().getPassword().equals(password);
        }
        return false;
    }

    @Override
    public boolean logout(String username) {
        Optional<User> optionalUser = userRepository.findById(username);
        return optionalUser.isPresent();
    }

}
