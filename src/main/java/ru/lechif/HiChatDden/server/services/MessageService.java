package ru.lechif.HiChatDden.server.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lechif.HiChatDden.server.dao.message.MessageDaoImpl;
import ru.lechif.HiChatDden.server.dao.models.ChatMessage;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MessageService {

    MessageDaoImpl dao;

    @Autowired
    public MessageService(MessageDaoImpl dao) {
        this.dao = dao;
    }

    public List<ChatMessage> getMessages(String chatId, int count) {
        return dao.getMessages(chatId, count);
    }

    public ChatMessage saveMessage(ChatMessage message){
        return dao.saveMessage(message);
    }
}
