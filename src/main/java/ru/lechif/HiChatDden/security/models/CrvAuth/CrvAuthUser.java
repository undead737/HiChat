package ru.lechif.HiChatDden.security.models.CrvAuth;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.lechif.HiChatDden.security.models.ApplicationUser;
import ru.lechif.HiChatDden.security.models.MongoEntity;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Document(collection = "users")
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CrvAuthUser extends MongoEntity implements ApplicationUser {
    String userName;
    String password;
    @Indexed(unique = true)
    String email;
    String firstName;
    String lastName;
    String patronymic;
    String birthDay;
    boolean isActive;
    List<CrvAuthRole> roles;
    @Indexed(unique = true)
    String phone;
}
