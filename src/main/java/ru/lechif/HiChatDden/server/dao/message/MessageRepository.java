package ru.lechif.HiChatDden.server.dao.message;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.lechif.HiChatDden.server.dao.models.ChatMessage;

public interface MessageRepository extends MongoRepository<ChatMessage, String> {
}
