package com.SHRAVANKUMAR.Intagram.service;

import com.SHRAVANKUMAR.Intagram.Model.User;
import com.SHRAVANKUMAR.Intagram.Model.UserAuthenticationToken;
import com.SHRAVANKUMAR.Intagram.Repo.IUserRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;
    @Autowired
    PTokenService pTokenService;

    public String AddUserSingUp(User newUser) {
        String newEmail = newUser.getEmail();

        User existingUser = iUserRepo.findByEmail(newEmail);

        if(existingUser != null)
        {
            return "email already in use";
        }

        // passwords are encrypted before we store it in the table

        String signUpPassword = newUser.getPassword();

        try {
            String encryptedPassword = PasswordEncryptor.encrypt(signUpPassword);

            newUser.setPassword(encryptedPassword);


            // patient table - save patient
            iUserRepo.save(newUser);
            return "Insta user registered";

        } catch (NoSuchAlgorithmException e) {

            return "Internal Server issues while saving password, try again later!!!";
        }
    }

    public String UserSingIn(String email, String password) {


        User existingUser = iUserRepo.findByEmail(email);

        if(existingUser==null){
            return "Not a valid email, Please sign up first !!!";
        }
        //password should be matched

        try {
            String encryptedPassword=PasswordEncryptor.encrypt(password);
            if(existingUser.getPassword().equals(encryptedPassword)){
                // return a token for this sign in
                UserAuthenticationToken token =new UserAuthenticationToken(existingUser);
                pTokenService.CreateToken(token);
                return token.getTokenValue();
            }
            else{
                //password was wrong!!!
                return "Invalid Credentials!!!";
            }
        } catch (NoSuchAlgorithmException e) {
            return "Internal Server issues while saving password, try again later!!!";
        }
    }

    public User updateUserDetails(Integer id, String updateNo)  {
        User existingUser = iUserRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));
        existingUser.setPhoneNumber(updateNo);


        if(updateNo != null){
            existingUser.setPhoneNumber(updateNo);
        }

        return iUserRepo.save(existingUser);
    }
}
