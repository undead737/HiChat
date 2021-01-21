package ru.lechif.HiChatDden.security.dao;

import org.springframework.stereotype.Component;
import ru.lechif.HiChatDden.security.models.ApplicationUser;
import ru.lechif.HiChatDden.utility.db.ApplicationDao;

import java.util.List;

@Component
public interface UserDao<T extends ApplicationUser> extends ApplicationDao {
    List<T> getUsers();
    T getUserById(String id);
    T getUserByName(String name);
    T register(T user);
}
