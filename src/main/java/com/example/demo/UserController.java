package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.User;
import com.example.demo.UserService;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUser(){return userService.getAllUser();}

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User user = userService.getUserByID(id);

        return user != null ? ResponseEntity.ok(user): ResponseEntity.notFound().build();
    }
    @PostMapping
    public ResponseEntity<User> createUserById(@Valid @RequestBody User user){
        User newUser = userService.createUser(user);

        return ResponseEntity.status(201).body(newUser);

    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUserById(@PathVariable Long id,@Valid @RequestBody User user){
        User updateUser = userService.updateUser(id,user);

        return updateUser != null ? ResponseEntity.ok(updateUser): ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable Long id){

        return userService.deleteUser(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

}
