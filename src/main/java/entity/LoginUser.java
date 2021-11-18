package entity;

import java.io.Serializable;

public class LoginUser implements Serializable {

    private String username = "ADMIN4U";
    private String password = "PASSWORD4U";

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
}
