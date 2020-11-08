package com.vastika.uib.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vastika.uib.model.User;
import com.vastika.uib.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	public void saveUser(@RequestBody User user) {
		userService.saveUser(user);
	}
	
	@PutMapping
	public void updateUser(@RequestBody User user) {
		userService.saveUser(user);
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}
	
	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUser();
	}
	
	@GetMapping(value="/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}

}
