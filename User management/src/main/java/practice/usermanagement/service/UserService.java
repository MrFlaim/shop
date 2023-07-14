package practice.usermanagement.service;

import practice.usermanagement.dto.FullUser;

public interface UserService {
    public FullUser getUser(String username);
    public void addUser(FullUser fullUser);
    public void updateUser(FullUser fullUser);
    public  void deleteUser(String username);
}
