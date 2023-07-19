package practice.usermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.usermanagement.dao.AuthorityRepository;
import practice.usermanagement.dao.UserRepository;
import practice.usermanagement.dto.FullUser;
import practice.usermanagement.entity.Authority;
import practice.usermanagement.entity.User;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthorityRepository authorityRepository;


    @Override
    public FullUser getUser(String username) {
        FullUser fullUser = new FullUser();
        Optional<User> optionalUser = userRepository.findById(username);
        Optional<Authority> optionalAuthority = authorityRepository.findById(username);
        if (optionalUser.isPresent() && optionalAuthority.isPresent()) {
            fullUser.setUser(optionalUser.get());
            fullUser.setAuthority(optionalAuthority.get());
        }
        return fullUser;
    }

    @Override
    public void addUser(FullUser fullUser) {
        userRepository.save(fullUser.getUser());
        authorityRepository.save(fullUser.getAuthority());
    }

    @Override
    public void updateUser(FullUser fullUser) {
        userRepository.save(fullUser.getUser());
        authorityRepository.save(fullUser.getAuthority());
    }

    @Override
    public void deleteUser(String username) {
        userRepository.deleteByUsername(username);
        authorityRepository.deleteByUsername(username);
    }
}
