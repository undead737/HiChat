package ru.lechif.HiChatDden.security.auth.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.lechif.HiChatDden.security.dao.RoleDao;
import ru.lechif.HiChatDden.security.auth.RoleService;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthRole;

@Service
public class JwtRoleService extends RoleService<CrvAuthRole> {

    @Autowired
    public JwtRoleService(@Qualifier("crvAuthRoleDao") RoleDao<CrvAuthRole> dao) {
        super(dao);
    }

}
