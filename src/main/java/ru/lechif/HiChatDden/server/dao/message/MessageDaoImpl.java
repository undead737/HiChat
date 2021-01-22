package ru.lechif.HiChatDden.server.dao.message;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.lechif.HiChatDden.server.dao.models.ChatMessage;

import java.util.List;

@Repository
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MessageDaoImpl implements MessageDao{

    final MessageRepository repository;

    @Autowired
    public MessageDaoImpl(MessageRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ChatMessage> getMessages(String chatId, int count) {
        return null;
    }

    @Override
    public ChatMessage saveMessage(ChatMessage message) {
        return repository.save(message);
    }

    @Override
    public String getName() {
        return "MessageDaoImpl";
    }
}
