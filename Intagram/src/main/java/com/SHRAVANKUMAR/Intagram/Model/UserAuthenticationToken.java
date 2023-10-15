package com.SHRAVANKUMAR.Intagram.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "UAuthentication")
public class UserAuthenticationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   // private String userValue;
    private String tokenValue;
    private LocalDateTime tokenCreationTime;
    @OneToOne
    private  User user;

    //each token should be linked with a patient

    public UserAuthenticationToken(User user) {
        this.tokenValue= tokenValue;
        this.tokenCreationTime = LocalDateTime.now();
        this.tokenValue = UUID.randomUUID().toString();
    }
}
