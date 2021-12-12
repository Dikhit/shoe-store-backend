package com.dikhit.shoeStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dikhit.shoeStore.model.Category;
import com.dikhit.shoeStore.service.CategoryService;

@RestController
@RequestMapping("api/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	
	@PostMapping
	public ResponseEntity<Category> create(@RequestBody Category category) {
		return new ResponseEntity<Category> (categoryService.create(category), HttpStatus.OK);
	}
}
