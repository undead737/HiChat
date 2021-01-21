package ru.lechif.HiChatDden.server.dao.old;

import ru.lechif.HiChatDden.server.tables.Server;
import ru.lechif.HiChatDden.utility.db.ApplicationDao;

import java.util.List;

public interface ServerDao extends ApplicationDao {
    boolean isActive(String id);
    Server getServer(String id);
    List<Server> getServersByUserId(String id);
    Server register(Server server);
}
