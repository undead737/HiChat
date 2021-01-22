package ru.lechif.HiChatDden.server.dao.chat;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.lechif.HiChatDden.server.dao.models.Chat;

public interface ChatRepository  extends MongoRepository<Chat, String> {
}
