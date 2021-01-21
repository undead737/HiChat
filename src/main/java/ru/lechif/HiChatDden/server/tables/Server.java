package ru.lechif.HiChatDden.server.tables;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "servers")
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Server {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", unique = true)
    String id;
    @Column(name = "name")
    String name;
    @Type(type = "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_active", columnDefinition = "SMALLINT")
    boolean is_Active;
    @Column(name = "connection")
    String connection;
    @Column(name = "user_id")
    String userId;
}
