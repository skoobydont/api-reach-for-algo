package com.example.demo.user;

class UserNotFoundException extends RuntimeException {

  UserNotFoundException(Long id) {
    super("Could not find user " + id);
  }
}