package com.aniket.connectifybackend.service;

import com.aniket.connectifybackend.models.Reels;
import com.aniket.connectifybackend.models.User;

import java.util.List;

public interface ReelsService {
    public Reels createReel(Reels reel, User user);
    public List<Reels> findAllReels();
    public List<Reels> findUserReel(Integer userId) throws Exception;

}
