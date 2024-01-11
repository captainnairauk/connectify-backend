package com.aniket.connectifybackend.service;

import com.aniket.connectifybackend.models.Chat;
import com.aniket.connectifybackend.models.Message;
import com.aniket.connectifybackend.models.User;

import java.util.List;

public interface MessageService {
    public Message createMessage(User user, Integer chatId, Message req) throws Exception;
    public List<Message> findChatsMessages(Integer chatId) throws Exception;
}
