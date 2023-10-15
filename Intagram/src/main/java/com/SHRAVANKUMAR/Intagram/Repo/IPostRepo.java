package com.SHRAVANKUMAR.Intagram.Repo;

import com.SHRAVANKUMAR.Intagram.Model.Post;

import com.SHRAVANKUMAR.Intagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepo extends JpaRepository<Post, Integer> {
    User findByEmail(String email);
}

