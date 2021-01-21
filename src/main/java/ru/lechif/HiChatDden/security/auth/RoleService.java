package ru.lechif.HiChatDden.security.auth;

import ru.lechif.HiChatDden.security.dao.RoleDao;
import ru.lechif.HiChatDden.security.models.ApplicationRole;

import java.util.List;

public abstract class RoleService<T extends ApplicationRole> {

    private final RoleDao<T> dao;

    public RoleService(RoleDao<T> dao) {
        this.dao = dao;
    }

    public T getRole(ApplicationRoles role) {
        return dao.getRole(role.name());
    }

    public List<T> getRoles() {return dao.getRoles();}

    public T createNew(T role) {return dao.createNew(role);}
}
