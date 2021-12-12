package com.dikhit.shoeStore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dikhit.shoeStore.exception.ResourceNotFound;
import com.dikhit.shoeStore.interfaces.UserInterface;
import com.dikhit.shoeStore.model.Role;
import com.dikhit.shoeStore.model.User;
import com.dikhit.shoeStore.repository.UserRepository;


@Service
public class UserService implements UserInterface {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private RoleService roleService;
	
	@Override
	public User register(User user) {
		Role role = roleService.getRoleById(1);
		user.setRole(role);
		return userRepository.save(user);
	}
	
	public User getUserById(long id) {
		return userRepository.findById(id).orElseThrow(
					() -> new ResourceNotFound("User", "ID", id)
				);
				
	}
	
	

}
