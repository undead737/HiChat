package ru.lechif.HiChatDden.server;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import ru.lechif.HiChatDden.server.models.ChatMessage;
import ru.lechif.HiChatDden.server.models.ChatNotification;

@Controller
public class ChatController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public ChatNotification greeting(ChatMessage message) throws Exception {
        Thread.sleep(3000); // simulated delay
        return new ChatNotification(message.getChat().getId(), message.getSenderId());
    }
}
