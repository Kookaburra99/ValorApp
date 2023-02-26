package jfr.xesweb.valorapp.api.service;

import jfr.xesweb.valorapp.api.model.User;
import jfr.xesweb.valorapp.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository users;

    @Autowired
    public UserService(UserRepository users) {
        this.users = users;
    }

    public Optional<User> create(User user){
        if(!users.existsById(user.getEmail())) {
            user.setPassword(user.getPassword());
            return Optional.of(users.insert(user));
        } else {
            return Optional.empty();
        }
    }

}
