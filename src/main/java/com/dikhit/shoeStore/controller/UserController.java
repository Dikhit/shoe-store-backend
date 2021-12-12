package com.dikhit.shoeStore.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dikhit.shoeStore.model.User;
import com.dikhit.shoeStore.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping
	public ResponseEntity<User> register(@RequestBody User user) {
		return new ResponseEntity<User> (userService.register(user), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") long id){
		return new ResponseEntity<User> (userService.getUserById(id), HttpStatus.OK);
	}
	
	
}
