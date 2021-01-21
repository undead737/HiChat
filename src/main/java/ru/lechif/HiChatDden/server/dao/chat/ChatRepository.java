package ru.lechif.HiChatDden.server.dao.chat;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.lechif.HiChatDden.server.models.Chat;
import ru.lechif.HiChatDden.server.models.ChatMessage;

public interface ChatRepository  extends MongoRepository<Chat, String> {
}
