package ru.lechif.HiChatDden.server.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.lang.NonNull;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleMessage {
    @NonNull
    String chatId;
    @NonNull
    String senderId;
    String text;
    String content;
    TypeContent typeContent;
}
