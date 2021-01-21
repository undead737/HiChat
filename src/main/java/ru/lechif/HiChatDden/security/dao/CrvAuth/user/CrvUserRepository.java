package ru.lechif.HiChatDden.security.dao.CrvAuth.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthUser;

import java.util.Optional;

public interface CrvUserRepository extends MongoRepository<CrvAuthUser, String> {
    Optional<CrvAuthUser> findByUserName(String name);
}
