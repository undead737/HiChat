package ru.lechif.HiChatDden.security.models.CliAuth;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import ru.lechif.HiChatDden.security.models.ApplicationRole;
import ru.lechif.HiChatDden.security.models.MongoEntity;

@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CliAuthRole extends MongoEntity implements ApplicationRole {
    String roleName;
}
