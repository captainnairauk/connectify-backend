package com.aniket.connectifybackend.repository;

import com.aniket.connectifybackend.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {
    public List<Message> findChatById(Integer chatId);
}
