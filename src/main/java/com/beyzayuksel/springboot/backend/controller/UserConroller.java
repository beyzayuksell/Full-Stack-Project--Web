package com.beyzayuksel.springboot.backend.controller;

import com.beyzayuksel.springboot.backend.model.User;
import com.beyzayuksel.springboot.backend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserConroller {

    @Autowired
    private UserRepository userRepository;

	// localhost:8080/api/users
    @GetMapping(value = "/users")
    public List<User> getUsers(){
         return this.userRepository.findAll();
    }

}
