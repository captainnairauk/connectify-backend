package com.aniket.connectifybackend.service;

import com.aniket.connectifybackend.models.Chat;
import com.aniket.connectifybackend.models.User;

import java.util.List;

public interface ChatService {
    public Chat createChat(User reqUser, User user2);

    public Chat findChatById(Integer chatId) throws Exception;

    public List<Chat> findUsersChat(Integer userId);
}
