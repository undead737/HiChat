package ru.lechif.HiChatDden.security.models.CrvAuth;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.lechif.HiChatDden.security.models.ApplicationRole;
import ru.lechif.HiChatDden.security.models.MongoEntity;

@EqualsAndHashCode(callSuper = true)
@Document(collection = "roles")
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CrvAuthRole extends MongoEntity implements ApplicationRole {
    @Indexed(unique = true)
    String roleName;
}
