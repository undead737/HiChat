package ru.lechif.HiChatDden;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.lechif.HiChatDden.security.auth.RoleService;
import ru.lechif.HiChatDden.security.models.CrvAuth.CrvAuthRole;
import ru.lechif.HiChatDden.server.ServerService;
import ru.lechif.HiChatDden.server.tables.Server;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Test {
    private final RoleService<CrvAuthRole> roleService;
    private final ServerService serverService;

    @Autowired
    public Test(RoleService<CrvAuthRole> roleService, ServerService serverService) {
        this.roleService = roleService;
        this.serverService = serverService;
    }

    @PostConstruct
    public void tt(){
        try {

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
