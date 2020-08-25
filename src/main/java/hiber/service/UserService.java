package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    User getUserByCar(long id, int serial);
    void add(User user);
    List<User> listUsers();
}
