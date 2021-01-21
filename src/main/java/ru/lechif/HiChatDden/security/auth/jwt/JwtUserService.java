package ru.lechif.HiChatDden.security.auth.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import ru.lechif.HiChatDden.security.dao.UserDao;
import ru.lechif.HiChatDden.security.auth.ApplicationRoles;
import ru.lechif.HiChatDden.security.auth.RoleService;
import ru.lechif.HiChatDden.security.auth.UserService;
import ru.lechif.HiChatDden.security.crypt.ApplicationCrypt;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthRole;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthUser;

import java.util.Collections;

@Service
class JwtUserService extends UserService<CrvAuthUser> {

    private final ApplicationCrypt<CrvAuthUser> crypt;
    private final RoleService<CrvAuthRole> roleService;

    @Autowired
    public JwtUserService(@Qualifier("crvAuthUserDao") UserDao<CrvAuthUser> dao, ApplicationCrypt<CrvAuthUser> crypt, RoleService<CrvAuthRole> roleService) {
        super(dao);
        this.crypt = crypt;
        this.roleService = roleService;
    }

    @Override
    public CrvAuthUser register(CrvAuthUser user) throws Exception {
        user.setActive(true);
        user.setRoles(Collections.singletonList(roleService.getRole(ApplicationRoles.HOST)));
        user.setPassword(crypt.crypt(user.getPassword()));
        try {
            return super.dao.register(user);
        } catch (DuplicateKeyException ex){
            throw new Exception("Пользователь с таким почтовым ящиком/телефоном уже зареган!");
        }
    }
}
