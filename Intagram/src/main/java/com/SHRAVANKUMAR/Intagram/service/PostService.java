package com.SHRAVANKUMAR.Intagram.service;

import com.SHRAVANKUMAR.Intagram.Model.Post;

//import com.SHRAVANKUMAR.Intagram.Repo.IPostRepo;
import com.SHRAVANKUMAR.Intagram.Model.User;
import com.SHRAVANKUMAR.Intagram.Repo.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    IPostRepo iPostRepo;
    @Autowired
    PTokenService pTokenService;

    public String createInstaPost(String email, String tokenValue, Post instaPost) {
        if (pTokenService.authenticate(email, tokenValue)) {
            User existingUser = iPostRepo.findByEmail(email); // Use the UserRepository here
            if (existingUser != null) {
                instaPost.setUser(existingUser);
                addPost(instaPost);
                return existingUser.getFirstName() + " posted!!";
            } else {
                return "User not found!";
            }
        } else {
            return "Unauthorized access!!!";
        }

    }

    private void addPost(Post instaPost) {
        iPostRepo.save(instaPost);
    }
    }


