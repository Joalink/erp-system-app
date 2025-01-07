package erp_system_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String username;
    private String email;
    private String password;
    private String role;

    public User(Long user_id, String username, String email, String password, String role) {
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getUser_id() {

        return user_id;
    }

    public void setUser_id(Long user_id) {

        this.user_id = user_id;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getRole() {

        return role;
    }

    public void setRole(String role) {

        this.role = role;
    }

}
