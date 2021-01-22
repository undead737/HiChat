package ru.lechif.HiChatDden.server.dao.user;

import ru.lechif.HiChatDden.server.dao.models.ChatUser;

import java.util.List;

public interface UserDao {
    ChatUser getUserById(String id);
    ChatUser saveUser(ChatUser user);
    void deleteUserById(String id);
}
