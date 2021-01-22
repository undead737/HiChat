package ru.lechif.HiChatDden.server.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import ru.lechif.HiChatDden.server.dao.chat.ChatDaoImpl;
import ru.lechif.HiChatDden.server.dao.models.Chat;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatService {

    final ChatDaoImpl dao;
    final UserService userService;

    public ChatService(ChatDaoImpl dao, UserService userService) {
        this.dao = dao;
        this.userService = userService;
    }

    public Chat getChatById(String chatId){
        return dao.getChatById(chatId);
    }

    public List<Chat> getChatsByUserId(String userId){
        return dao.getChatsByUserId(userId);
    }

    public void saveChat(Chat chat){
        dao.saveChat(chat);
    }

    public void addUserToChat(String chatId, String userId){
        Chat temp = getChatById(chatId);
        temp.getParticipants().add(userService.getUserById(userId).getId());
        saveChat(temp);
    }

    public void deleteUserFromChat(String chatId, String userId){
        Chat temp = getChatById(chatId);
        temp.getParticipants().remove(userService.getUserById(userId).getId());
        saveChat(temp);
    }

}
