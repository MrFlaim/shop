package practice.authenticationandauthorization.entity;

import jakarta.persistence.*;

@Entity
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleID;

    @Column(name = "authority")
    private String authority;

    @OneToOne
    @JoinColumn(name = "roleID")
    private User user;

    public Authority(int roleID, String authority) {
        this.roleID = roleID;
        this.authority = authority;
    }

    public Authority() {

    }

    public int getUsername() {
        return roleID;
    }

    public void setUsername(int roleID) {
        this.roleID = roleID;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
