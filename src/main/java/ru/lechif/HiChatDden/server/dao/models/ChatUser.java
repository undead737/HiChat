package ru.lechif.HiChatDden.server.dao.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;

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
