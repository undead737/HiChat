package ru.lechif.HiChatDden.security.dao.CliAuth.user;

import org.springframework.stereotype.Repository;
import ru.lechif.HiChatDden.security.dao.UserDao;
import ru.lechif.HiChatDden.security.models.CliAuth.CliAuthUser;

import java.util.List;

@Repository("CliAuthUserDao")
public class CliAuthUserDao implements UserDao<CliAuthUser>  {

    private static final String name = "CliAuthUser";

    @Override
    public List<CliAuthUser> getUsers() {
        return null;
    }

    @Override
    public CliAuthUser getUserById(String id) {
        return null;
    }

    @Override
    public CliAuthUser getUserByName(String name) {
        return null;
    }

    @Override
    public CliAuthUser register(CliAuthUser user) {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
