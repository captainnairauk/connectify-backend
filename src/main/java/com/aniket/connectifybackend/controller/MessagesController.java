package com.aniket.connectifybackend.controller;

import com.aniket.connectifybackend.models.Messages;
import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MessagesController {
    @GetMapping("/messages")
    public List<Messages> getMessages(){
        List<Messages> messages =new ArrayList<>();
        Messages message1 = new Messages();
        Messages message2 = new Messages();

        messages.add(message1);
        messages.add(message2);

        return messages;
    }
}
