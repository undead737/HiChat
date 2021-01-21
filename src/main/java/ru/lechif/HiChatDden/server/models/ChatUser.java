package ru.lechif.HiChatDden.server.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.lechif.HiChatDden.security.models.MongoEntity;

@Document(collection = "users")
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatUser {
    String id;
    String firstName;
    String lastName;
    String patronymic;
    String birthDay;
}
