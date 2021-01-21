package ru.lechif.HiChatDden.server.dao.message;

import ru.lechif.HiChatDden.server.models.ChatMessage;
import ru.lechif.HiChatDden.utility.db.ApplicationDao;

import java.util.List;

public interface MessageDao extends ApplicationDao {
    List<ChatMessage> getMessages(String chatId, int count);
    ChatMessage saveMessage(ChatMessage message);

}
