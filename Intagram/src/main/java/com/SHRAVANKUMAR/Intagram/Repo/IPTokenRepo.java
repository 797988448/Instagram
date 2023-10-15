package com.SHRAVANKUMAR.Intagram.Repo;

import com.SHRAVANKUMAR.Intagram.Model.UserAuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPTokenRepo extends JpaRepository<UserAuthenticationToken, Integer> {
    UserAuthenticationToken findByTokenValue(String tokenValue);

}


