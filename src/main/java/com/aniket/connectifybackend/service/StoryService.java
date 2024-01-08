package com.aniket.connectifybackend.service;

import com.aniket.connectifybackend.models.Story;
import com.aniket.connectifybackend.models.User;

import java.util.List;

public interface StoryService {
    public Story createStory(Story story, User user);

    public List<Story> findStoryByUserId(Integer userId) throws Exception;
}
