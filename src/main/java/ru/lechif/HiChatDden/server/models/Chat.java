package ru.lechif.HiChatDden.server.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;
import ru.lechif.HiChatDden.security.models.MongoEntity;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Document(collection = "users")
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chat extends MongoEntity {
    String name;
    @NonNull
    List<String> participants;
}
