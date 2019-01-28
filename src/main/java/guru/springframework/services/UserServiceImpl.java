package guru.springframework.services;

import guru.springframework.domain.User;
import guru.springframework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser() {
        userRepository.findById();
        User user = new User();
        user.setLogin("llll");
        return user;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
