package ru.lechif.HiChatDden.security.dao.CrvAuth.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.lechif.HiChatDden.security.dao.UserDao;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthUser;

import java.util.List;

@Repository
public class CrvAuthUserDao implements UserDao<CrvAuthUser> {

    private final CrvUserRepository repository;
    private final static String name = "CrvAuthUser";

    @Autowired
    public CrvAuthUserDao(CrvUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CrvAuthUser> getUsers() {
        return repository.findAll();
    }

    @Override
    public CrvAuthUser getUserById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public CrvAuthUser getUserByName(String name) {
        return repository.findByUserName (name).orElse(null);
    }

    @Override
    public CrvAuthUser register(CrvAuthUser user) {
        return repository.insert(user);
    }

    @Override
    public String getName() {
        return name;
    }
}
