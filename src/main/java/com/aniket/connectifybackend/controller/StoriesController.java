package com.aniket.connectifybackend.controller;

import com.aniket.connectifybackend.models.Stories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StoriesController {
    @GetMapping("/stories")
    public List<Stories> getStories(){
        List<Stories> stories = new ArrayList<>();
        Stories story1 = new Stories();
        Stories story2 = new Stories();

        stories.add(story1);
        stories.add(story2);

        return stories;
    }
}
