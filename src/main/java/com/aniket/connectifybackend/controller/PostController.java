package com.aniket.connectifybackend.controller;

import com.aniket.connectifybackend.models.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PostController {
    @GetMapping("/posts")
    public List<Post> getPosts(){
        List<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        Post post2 = new Post();

        posts.add(post1);
        posts.add(post2);
        return posts;
    };
}
