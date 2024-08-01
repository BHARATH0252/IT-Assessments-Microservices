package com.ust.User_Service.Service;

import com.ust.User_Service.Model.User_info;
import com.ust.User_Service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User_info addUser(User_info user) {
        return  repo.save(user);
    }

    public Optional<User_info> getUser(String userId) {
        return repo.findById(userId);
    }

    public User_info deleteUser(String userId) {
        Optional<User_info> userOptional = repo.findById(userId);
        if(userOptional.isPresent()){
            repo.deleteById(userId);
        }
        return userOptional.get();
    }
}
