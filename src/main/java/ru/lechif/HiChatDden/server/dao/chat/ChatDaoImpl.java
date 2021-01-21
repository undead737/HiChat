package ru.lechif.HiChatDden.server.dao.chat;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.lechif.HiChatDden.server.dao.message.MessageRepository;
import ru.lechif.HiChatDden.server.models.Chat;

import java.util.List;

@Repository
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatDaoImpl implements ChatDao{

    final ChatRepository repository;

    @Autowired
    public ChatDaoImpl(ChatRepository repository) {
        this.repository = repository;
    }


    @Override
    public String getName() {
        return "ChatDaoImpl";
    }

    @Override
    public List<Chat> getChatsByUserId(String idUser) {
        return null;
    }

    @Override
    public Chat saveChat(Chat chat) {
        return repository.save(chat);
    }

    @Override
    public Chat getChatById(String idChat) {
        return repository.findById(idChat).orElse(null);
    }

    @Override
    public void deleteChat(String idChat) {
        repository.deleteById(idChat);
    }
}
