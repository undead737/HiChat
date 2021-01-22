package ru.lechif.HiChatDden.server.controllers;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.lechif.HiChatDden.server.dao.models.ChatUser;
import ru.lechif.HiChatDden.server.models.SimpleUser;
import ru.lechif.HiChatDden.server.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/chat/user")
@CrossOrigin(origins = "http://localhost:4200")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatUsersController {

    final UserService userService;

    @Autowired
    public ChatUsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("getUserById")
    public ChatUser getSimpleUserById(String id){
        return userService.getUserById(id);
    }

    @PostMapping("saveUser")
    public void saveUser(@RequestBody SimpleUser userService){
        //return  userService.saveUser(userService);
    }
}
