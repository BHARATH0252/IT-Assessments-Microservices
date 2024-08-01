package com.ust.User_Service.Controller;

import com.ust.User_Service.Model.User_info;
import com.ust.User_Service.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity<User_info> addPatient(@RequestBody User_info user) {
        return ResponseEntity.ok(userService.addUser(user));
    }

    @GetMapping()
    public ResponseEntity<Optional<User_info>> getUser(@RequestParam String userId){
        return ResponseEntity.ok(userService.getUser(userId));
    }

    @DeleteMapping()
    public ResponseEntity<User_info> deleteUser(@RequestParam String userId){
        return  ResponseEntity.ok(userService.deleteUser(userId));
    }

}
