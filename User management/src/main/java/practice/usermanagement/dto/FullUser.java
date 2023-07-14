package practice.usermanagement.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import practice.usermanagement.entity.Authority;
import practice.usermanagement.entity.User;

public class FullUser {

    private User user;

    private Authority authority;

    public FullUser() {
    }

    public FullUser(User user, Authority authority) {
        this.user = user;
        this.authority = authority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }
}