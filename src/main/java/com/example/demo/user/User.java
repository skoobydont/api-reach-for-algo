package com.example.demo.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public
class User {
  // Attributes
  private @Id @GeneratedValue Long id;
  private String firstName;
  private String lastName;
  private String email;
  // private Long ssn;
  // TODO: address relationship | https://www.baeldung.com/spring-data-rest-relationships
  // Constructors
  public User() {}
  public User(String firstName, String lastName, String email, Long ssn) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    // this.ssn = ssn;
  }
  // Getters
  public Long getId() {
    return this.id;
  }
  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }
  public String getFullName() {
    return this.firstName.concat(" ").concat(this.lastName);
  }
  public String getEmail() {
    return this.email;
  }
  // Setters
  public void setFirstName(String fName) {
    this.firstName = fName;
  }
  public void setLastName(String lName) {
    this.lastName = lName;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "User{ " +
      "\nid: " + this.id +
      "\nName: " + this.getFullName() +
      "\nemail: " + this.email +
    "\n}";
  }
}