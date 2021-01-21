package ru.lechif.HiChatDden.server.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lechif.HiChatDden.server.dao.user.UserDaoImpl;
import ru.lechif.HiChatDden.server.models.ChatUser;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserService {
    final UserDaoImpl dao;

    @Autowired
    public UserService(UserDaoImpl dao) {
        this.dao = dao;
    }

    public ChatUser getUserById(String id){
        return dao.getUserById(id);
    }

    public ChatUser saveUser(ChatUser user){
        return dao.saveUser(user);
    }

    public void deleteUserById(String id){
        dao.deleteUserById(id);
    }
}
