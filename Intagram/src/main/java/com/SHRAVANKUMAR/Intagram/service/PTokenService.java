package com.SHRAVANKUMAR.Intagram.service;

import com.SHRAVANKUMAR.Intagram.Model.UserAuthenticationToken;


import com.SHRAVANKUMAR.Intagram.Repo.IPTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PTokenService {
    @Autowired
    IPTokenRepo ipTokenRepo;

    public void CreateToken(UserAuthenticationToken token) {
        ipTokenRepo.save(token);
    }

    public boolean authenticate(String email, String tokenValue) {
        UserAuthenticationToken token =ipTokenRepo.findByTokenValue(tokenValue);
        if(token!=null)
        {
            return token.getUser().getEmail().equals(email);
        }
        else
        {
            return false;
        }
    }
}
