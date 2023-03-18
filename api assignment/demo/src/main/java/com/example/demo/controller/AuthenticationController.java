package com.example.demo.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AuthenticationService;

@RestController
public class AuthenticationController {

  @Autowired
  private AuthenticationService authenticationService;

  @PostMapping("/login")
  public ResponseEntity<?> authenticateUser(@RequestBody User user) {
    String token = authenticationService.authenticateUser(user);
    return ResponseEntity.ok(token);
  }
}