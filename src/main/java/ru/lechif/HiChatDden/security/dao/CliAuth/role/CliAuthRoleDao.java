package ru.lechif.HiChatDden.security.dao.CliAuth.role;

import org.springframework.stereotype.Repository;
import ru.lechif.HiChatDden.security.dao.RoleDao;
import ru.lechif.HiChatDden.security.models.CliAuth.CliAuthRole;

import java.util.List;

@Repository
public class CliAuthRoleDao implements RoleDao<CliAuthRole> {

    private static final String name = "CliAuthRole";

    @Override
    public List<CliAuthRole> getRoles() {
        return null;
    }

    @Override
    public CliAuthRole getRole(String role) {
        return null;
    }

    @Override
    public CliAuthRole createNew(CliAuthRole role) {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
