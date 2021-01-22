package ru.lechif.HiChatDden.server.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleUser {
    String id;
    String firstName;
    String lastName;
    String patronymic;
    String birthDay;
}
