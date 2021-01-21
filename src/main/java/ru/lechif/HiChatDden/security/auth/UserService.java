package ru.lechif.HiChatDden.security.auth;

import ru.lechif.HiChatDden.security.dao.UserDao;
import ru.lechif.HiChatDden.security.models.ApplicationUser;

import java.util.List;

public abstract class UserService<T extends ApplicationUser> {

    protected final UserDao<T> dao;

    public UserService(UserDao<T> dao) {
        this.dao = dao;
    }

    public List<T> getUsers(){
        return dao.getUsers();
    }

    public T getUserById(String id){
        return dao.getUserById(id);
    };

    public T getUserByName(String name){
        return dao.getUserByName(name);
    }

    public abstract T register(T user) throws Exception;
}
