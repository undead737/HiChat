package ru.lechif.HiChatDden.security.dao.CrvAuth.role;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthRole;

public interface RoleRepository extends MongoRepository<CrvAuthRole, String> {
    CrvAuthRole findOneByRoleName(String name);
}
