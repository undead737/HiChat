package ru.lechif.HiChatDden.security.models.CliAuth;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import ru.lechif.HiChatDden.security.models.ApplicationRole;
import ru.lechif.HiChatDden.security.models.MongoEntity;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class CliAuthRole extends MongoEntity implements ApplicationRole {
    String roleName;
}
