package com.dikhit.shoeStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dikhit.shoeStore.interfaces.CategoryInterface;
import com.dikhit.shoeStore.model.Category;
import com.dikhit.shoeStore.repository.CategoryRepository;

@Service
public class CategoryService implements CategoryInterface {


	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Category create(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category update(long categoryId, Category category) {
		return null;
	}

	@Override
	public List<Category> getAllCategory() {
		return null;
	}

	@Override
	public String deleteCategory(long categoryId) {
		return null;
	}

}
