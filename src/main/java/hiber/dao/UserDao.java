package hiber.dao;

import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao {
   void add(User user);
   User getUserByCar(long id, int serial);
   List<User> listUsers();
}
