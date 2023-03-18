package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

@Service
public class AuthenticationService {

  // use your preferred library to generate JWT tokens
  private final String SECRET_KEY = "secret_key";

  public String authenticateUser(User user) {
    // check if user exists in database, and verify credentials
    // ...
    // generate and return JWT token
    // ...
	  return SECRET_KEY;
  }
}