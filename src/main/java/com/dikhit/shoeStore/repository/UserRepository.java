package com.dikhit.shoeStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dikhit.shoeStore.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
