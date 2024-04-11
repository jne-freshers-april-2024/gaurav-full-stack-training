package com.thinkitive.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    // JPA/Hibernate -> DataBase
    // UserDaoService => Static List

    private static List<User> users = new ArrayList<>();
    private static int usersCont = 0;

    static{
        users.add(new User(++usersCont, "Ram", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCont, "Sita", LocalDate.now().minusYears(25)));
        users.add(new User(++usersCont, "Sham", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll() {
        return users;
    }
    // public List<User> findAll(){}
     public User save(User user){
        user.setId(++usersCont);
        users.add(user);
        return user;
     }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> Integer.valueOf(user.getId()).equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> Integer.valueOf(user.getId()).equals(id);
        users.removeIf(predicate);
    }
}
