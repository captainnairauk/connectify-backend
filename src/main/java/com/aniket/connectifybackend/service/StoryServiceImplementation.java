package com.aniket.connectifybackend.service;

import com.aniket.connectifybackend.models.Story;
import com.aniket.connectifybackend.models.User;
import com.aniket.connectifybackend.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StoryServiceImplementation implements StoryService{
    @Autowired
    private StoryRepository storyRepository;
    @Autowired
    private UserService userService;
    @Override
    public Story createStory(Story story, User user) {
        Story createdStory = new Story();
        createdStory.setCaptions(story.getCaptions());
        createdStory.setImage(story.getImage());
        createdStory.setUser(user);
        createdStory.setTimestamp(LocalDateTime.now());
        return storyRepository.save(createdStory);
    }

    @Override
    public List<Story> findStoryByUserId(Integer userId) throws Exception {
        User user = userService.findUserById(userId);

        return storyRepository.findByUserId(userId);
    }


}
