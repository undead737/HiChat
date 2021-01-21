package ru.lechif.HiChatDden.security.models;

import lombok.Data;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.mapping.MongoId;
import ru.lechif.HiChatDden.utility.db.Auditable;

@Data
public class MongoEntity extends Auditable<String> {
    @MongoId
    private String id;
}
