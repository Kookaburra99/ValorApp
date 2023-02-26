package jfr.xesweb.valorapp.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Document(collection = "users")
public class User {
    @Id
    @NotBlank(message = "The email field can not be empty")
    String email;
    String nickname;
    String password;
    String picture;

    public User(String email, String nickname, String password, String picture) {
        this.email = email;
        this.nickname = nickname;
        this.password = password;
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public User setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public User setPicture(String picture) {
        this.picture = picture;
        return this;
    }
}
