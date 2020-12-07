package com.example.spring_rest_api.service;

import com.example.spring_rest_api.model.User;
import com.example.spring_rest_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service    // special class for implementation of business logic of api
public class UserService {
    @Autowired      // implement dependency injection
    private UserRepository userRepository;  // object of repository
    // SELECT * FROM user;
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    // INSERT INTO user VALUES (?,?,?,?,?);
    public User addUser(User user){
        return userRepository.save(user);
    }
    // SELECT * FROM user WHERE email = ?;
    public User getUserByEmail(String email){
        return userRepository.findFirstByEmail(email);
    }
    // DELETE FROM user WHERE userId = ?;
    public boolean deleteUserById(int userId){
        boolean result = false;
        if(userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
            result = true;
        }
        return result;
    }
    // UPDATE user SET password = ? WHERE userId = ?;
    public User updatePassword(int userId, String newPassword){
        User user = null;
        Optional<User> userOptional = userRepository.findById(userId); // Optional<> -> can contains value or null
        if(userOptional.isPresent()){                                  // if not null value is present returns true
            User userToUpdate = userOptional.get();                    // get value from optional
            userToUpdate.setPassword(newPassword);
            user = userRepository.save(userToUpdate);                  // UPDATE when is executed on existing object in the repository
        }
        return user;
    }
}
