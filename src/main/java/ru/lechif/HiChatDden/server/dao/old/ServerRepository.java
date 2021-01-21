package ru.lechif.HiChatDden.server.dao.old;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lechif.HiChatDden.server.tables.Server;

import java.util.List;

public interface ServerRepository extends JpaRepository<Server, String> {
    List<Server> findAllByUserId(String userId);
}
