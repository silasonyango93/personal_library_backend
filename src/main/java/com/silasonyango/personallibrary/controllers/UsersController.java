package com.silasonyango.personallibrary.controllers;

import com.silasonyango.personallibrary.exception.ResourceNotFoundException;
import com.silasonyango.personallibrary.models.UserModel;
import com.silasonyango.personallibrary.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
        System.out.println(userRepository.getUsers());
        return userRepository.getUsers();
    }

    @PostMapping("/create_user")
    public UserModel createUser(@Valid UserModel user) {
        return userRepository.save(user);
    }



}
