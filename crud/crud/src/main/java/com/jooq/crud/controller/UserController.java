package com.jooq.crud.controller;

import org.springframework.web.bind.annotation.RestController;

//import com.jooq.crud.model.tables.Users;
import com.jooq.crud.service.UserService;

import com.jooq.crud.model.tables.pojos.Users;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UserController {
	
 @Autowired
UserService userService;
 
 @GetMapping("/user")
 public List<Users> getUsers(){
	 return this.userService.getUsers();
 }
 
 @GetMapping("/checking")
 public String checking()
 {
	 return this.userService.checking();
 }
 
 @PutMapping("/update")
 public void updateUsers(@RequestBody Users user)
 {
	 this.userService.updateUsers(user);
 }
 
 @DeleteMapping("/delete")
 public void deleteUsers(@RequestBody Users user)
 {
	 this.userService.deleteUsers(user);
 }
 
 @PostMapping("/add")
 public void addUsers(@RequestBody Users user)
 {
	 this.userService.addUsers(user);
 }
 
 

}
