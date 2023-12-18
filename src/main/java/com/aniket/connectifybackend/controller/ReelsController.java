package com.aniket.connectifybackend.controller;

import com.aniket.connectifybackend.models.Reels;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReelsController {
    @GetMapping("/reels")
    public List<Reels> getReels(){
        List<Reels> reels = new ArrayList<>();
        Reels reels1 = new Reels();
        Reels reels2 = new Reels();

        reels.add(reels1);
        reels.add(reels2);
        return reels;
    }
}
