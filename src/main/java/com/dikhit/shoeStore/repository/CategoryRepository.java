package com.dikhit.shoeStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dikhit.shoeStore.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
