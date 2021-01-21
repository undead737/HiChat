package ru.lechif.HiChatDden.security.models.CliAuth;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import ru.lechif.HiChatDden.security.models.ApplicationUser;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthRole;
import ru.lechif.HiChatDden.security.models.MongoEntity;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CliAuthUser extends MongoEntity implements ApplicationUser {
    String userName;
    String password;
    String email;
    boolean isActive;
    List<CrvAuthRole> roles;
    String phone;
}
