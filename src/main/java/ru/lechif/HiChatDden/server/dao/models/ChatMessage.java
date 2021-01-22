package ru.lechif.HiChatDden.server.dao.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;
import ru.lechif.HiChatDden.security.models.MongoEntity;
import ru.lechif.HiChatDden.server.models.MessageStatus;
import ru.lechif.HiChatDden.server.models.TypeContent;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Document(collection = "users")
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage extends MongoEntity {
    @NonNull
    Chat chat;
    @NonNull
    String senderId;
    String text;
    @Lob
    byte[] content;
    TypeContent typeContent;
    MessageStatus status;
}
