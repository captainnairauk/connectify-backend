package com.aniket.connectifybackend.controller;

import com.aniket.connectifybackend.models.Story;
import com.aniket.connectifybackend.models.User;
import com.aniket.connectifybackend.service.StoryService;
import com.aniket.connectifybackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StoryController {
    @Autowired
    private StoryService storyService;
    @Autowired
    private UserService userService;

    @PostMapping("/api/story")
    public Story createStory(@RequestBody Story story, @RequestHeader("Authorization") String jwt){
        User reqUser = userService.findUserByJwt(jwt);
        Story createdStory = storyService.createStory(story, reqUser);
        return createdStory;
    }

    @GetMapping("/api/story/user/{userId}")
    public List<Story> findUserStory(@PathVariable Integer userId,  @RequestHeader("Authorization") String jwt) throws Exception {
        User reqUser = userService.findUserByJwt(jwt);
        List<Story> stories = storyService.findStoryByUserId(userId);
        return stories;
    }
}
