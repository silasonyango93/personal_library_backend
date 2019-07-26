package com.silasonyango.personallibrary.controllers;

import com.silasonyango.personallibrary.exception.ResourceNotFoundException;
import com.silasonyango.personallibrary.models.UserModel;
import com.silasonyango.personallibrary.repository.UserRepository;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/")
public class UsersController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/get_users")
    public List<UserModel> getAllUsers() {
        return userRepository.getUsers();
    }

    @PostMapping("/create_user")
    public UserModel createUser(@Valid UserModel user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);

        return userRepository.save(user);
    }

    @PostMapping("/signin")
    public List<UserModel> findByEmail(@Valid @RequestBody JSONObject emailOject) {
        return userRepository.findByEmail(emailOject.getAsString("attemptedEmail"));
    }

}
