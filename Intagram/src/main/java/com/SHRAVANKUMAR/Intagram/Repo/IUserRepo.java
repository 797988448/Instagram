package com.SHRAVANKUMAR.Intagram.Repo;

import com.SHRAVANKUMAR.Intagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepo extends JpaRepository<User,Integer> {
   // User findByEmail(String email);
    User findByEmail(String newEmail);

}
