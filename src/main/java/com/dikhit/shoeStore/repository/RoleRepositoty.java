package com.dikhit.shoeStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dikhit.shoeStore.model.Role;

public interface RoleRepositoty extends JpaRepository<Role, Long> {
	
}
