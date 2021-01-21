package ru.lechif.HiChatDden.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lechif.HiChatDden.server.dao.old.ServerDaoImpl;
import ru.lechif.HiChatDden.server.tables.Server;

import java.util.List;

@Service
public class ServerService {

    private final ServerDaoImpl dao;

    @Autowired
    public ServerService(ServerDaoImpl dao) {
        this.dao = dao;
    }

    public Server getServer(String id){
        return dao.getServer(id);
    }

    public List<Server> getServersByUserId(String id){
        return dao.getServersByUserId(id);
    }

    public Server register(Server server){
        return dao.register(server);
    }

}
