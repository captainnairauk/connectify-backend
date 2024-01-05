package com.aniket.connectifybackend.controller;

import com.aniket.connectifybackend.models.Reels;
import com.aniket.connectifybackend.models.User;
import com.aniket.connectifybackend.service.ReelsService;
import com.aniket.connectifybackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ReelsController {
    @Autowired
    private ReelsService reelsService;
    @Autowired
    private UserService userService;

    @PostMapping("/api/reels")
    public Reels createReels(@RequestBody Reels reel, @RequestHeader("Authorization") String jwt ){
        User reqUser = userService.findUserByJwt(jwt);
        Reels createdReels = reelsService.createReel(reel, reqUser);

        return createdReels;
    }

    @GetMapping("/api/reels")
    public List<Reels> findAllReels(){
        List<Reels> reels = reelsService.findAllReels();

        return reels;
    }

    @GetMapping("/api/reels/user/{userId}")
    public List<Reels> findUsersReels(@PathVariable Integer userId) throws Exception {
        List<Reels> reels = reelsService.findUserReel(userId);

        return reels;
    }
}
