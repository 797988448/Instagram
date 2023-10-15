package com.SHRAVANKUMAR.Intagram.controller;


import com.SHRAVANKUMAR.Intagram.Model.Post;
import com.SHRAVANKUMAR.Intagram.service.PostService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
   PostService postService;

    @PostMapping("InstaPost")
    public String createInstaPost(@RequestParam String email, @RequestParam String tokenValue, @RequestBody Post instaPost)
    {
        return postService.createInstaPost(email,tokenValue,instaPost);
    }
}
