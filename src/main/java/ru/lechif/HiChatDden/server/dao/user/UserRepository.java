package ru.lechif.HiChatDden.server.dao.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.lechif.HiChatDden.server.dao.models.ChatUser;

public interface UserRepository  extends MongoRepository<ChatUser, String> {
}
