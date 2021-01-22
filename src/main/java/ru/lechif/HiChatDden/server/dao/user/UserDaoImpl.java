package ru.lechif.HiChatDden.server.dao.user;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.lechif.HiChatDden.server.dao.models.ChatUser;

@Repository
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDaoImpl implements UserDao{

    final UserRepository repository;

    @Autowired
    public UserDaoImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public ChatUser getUserById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public ChatUser saveUser(ChatUser user) {
        return repository.save(user);
    }

    @Override
    public void deleteUserById(String id) {
        repository.deleteById(id);
    }
}
