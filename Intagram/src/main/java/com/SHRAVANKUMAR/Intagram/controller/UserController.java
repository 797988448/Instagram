package com.SHRAVANKUMAR.Intagram.controller;

import com.SHRAVANKUMAR.Intagram.Model.User;
import com.SHRAVANKUMAR.Intagram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class UserController {
    @Autowired
    UserService userService;
    //sign up
    @PostMapping("Api/post/")
    public String AddUserSingUp(@RequestBody User newUser){
        return userService.AddUserSingUp(newUser);
    }
@PostMapping("user/signIn/{email}/{password}")
    public String UserSingIn(@PathVariable String email, @PathVariable String password ){
        return userService.UserSingIn(email,password);
}
    @PutMapping("Api/{userId}/{updateNo}update")
    public User updateUserDetails(@RequestParam Integer  Id, @RequestParam String updateNo) {
        return userService.updateUserDetails(Id, updateNo);
    }

}
