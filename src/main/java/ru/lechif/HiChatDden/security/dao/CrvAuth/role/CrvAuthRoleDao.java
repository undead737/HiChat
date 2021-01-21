package ru.lechif.HiChatDden.security.dao.CrvAuth.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.lechif.HiChatDden.security.dao.RoleDao;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthRole;

import java.util.List;

@Repository
public class CrvAuthRoleDao implements RoleDao<CrvAuthRole> {

    private final RoleRepository repository;
    private final static String name = "CrvAuthRole";

    @Autowired
    public CrvAuthRoleDao(RoleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CrvAuthRole> getRoles() {
        return repository.findAll();
    }

    @Override
    public CrvAuthRole getRole(String name) {
        return repository.findOneByRoleName(name);
    }

    @Override
    public CrvAuthRole createNew(CrvAuthRole role) {
        return repository.insert(role);
    }

    @Override
    public String getName() {
        return name;
    }
}
