package com.example.demo.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {
  private final UserRepository repository;

  UserController(UserRepository repository) {
    this.repository = repository;
  }
  // test
  @GetMapping("/")
  public String getHealthCheck() {
    return "Heyo!";
  }
  
}