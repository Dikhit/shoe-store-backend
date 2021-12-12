package com.dikhit.shoeStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dikhit.shoeStore.model.Role;
import com.dikhit.shoeStore.service.RoleService;


@RestController
@RequestMapping("/api/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@PostMapping
	public ResponseEntity<Role> createRole(@RequestBody Role role) {
		return new ResponseEntity<> (roleService.createRole(role), HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Role> getRoleById(@PathVariable("id") long id){
		return new ResponseEntity<> (roleService.getRoleById(id), HttpStatus.FOUND);
	}
	
	@GetMapping
	public ResponseEntity<List<Role>> getALlRoles() {
		return new ResponseEntity<List<Role>> (roleService.getAllRoles(), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Role> updateRole(@PathVariable("id") long id, @RequestBody Role role){
		return new ResponseEntity<> (roleService.updateRole(id, role), HttpStatus.FOUND);
	}
}
