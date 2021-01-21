package ru.lechif.HiChatDden.server.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;
import ru.lechif.HiChatDden.security.models.MongoEntity;

import javax.persistence.*;
import java.util.Date;

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
