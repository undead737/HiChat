package ru.lechif.HiChatDden.server.dao.message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthRole;
import ru.lechif.HiChatDden.server.models.ChatMessage;

public interface MessageRepository extends MongoRepository<ChatMessage, String> {
}
