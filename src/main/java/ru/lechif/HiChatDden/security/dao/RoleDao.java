package ru.lechif.HiChatDden.security.dao;

import org.springframework.stereotype.Component;
import ru.lechif.HiChatDden.security.models.ApplicationRole;
import ru.lechif.HiChatDden.utility.db.ApplicationDao;

import java.util.List;

@Component
public interface RoleDao<T extends ApplicationRole> extends ApplicationDao {
    List<T> getRoles();
    T getRole(String name);
    T createNew(T role);
}
