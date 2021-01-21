package ru.lechif.HiChatDden.server.dao.old;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.lechif.HiChatDden.server.tables.Server;

import java.util.List;

@Repository
public class ServerDaoImpl implements ServerDao{

    private static final String name = "ServerDao";
    private final ServerRepository repository;

    @Autowired
    public ServerDaoImpl(ServerRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean isActive(String id) {
        return false;
    }

    @Override
    public Server getServer(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Server> getServersByUserId(String id) {
        return repository.findAllByUserId(id);
    }

    @Override
    public Server register(Server server) {
        return repository.save(server);
    }

    @Override
    public String getName() {
        return name;
    }
}
