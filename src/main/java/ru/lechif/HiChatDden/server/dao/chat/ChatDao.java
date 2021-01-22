package ru.lechif.HiChatDden.server.dao.chat;

import ru.lechif.HiChatDden.server.dao.models.Chat;
import ru.lechif.HiChatDden.utility.db.ApplicationDao;

import java.util.List;

public interface ChatDao extends ApplicationDao {
    List<Chat> getChatsByUserId(String idUser);
    Chat saveChat(Chat chat);
    Chat getChatById(String idChat);
    void deleteChat(String idChat);
}
