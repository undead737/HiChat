package ru.lechif.HiChatDden.server;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import ru.lechif.HiChatDden.server.dao.models.ChatNotification;
import ru.lechif.HiChatDden.server.models.SimpleMessage;

@Controller
public class ChatController {
    @MessageMapping("/chat")
    @SendTo("/topic/public")
    public ChatNotification greeting(@Payload SimpleMessage message) throws Exception {
        System.out.println(message.getChatId());
        Thread.sleep(3000); // simulated delay
        return new ChatNotification(message.getChatId(), message.getSenderId());
    }
}
