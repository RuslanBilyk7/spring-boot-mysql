package guru.springframework.services;

import guru.springframework.domain.User;

public interface UserService {
    User getUser();
    void addUser(User user);
}
