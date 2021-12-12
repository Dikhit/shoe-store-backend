package com.dikhit.shoeStore.interfaces;

import java.util.List;

import com.dikhit.shoeStore.model.Category;

public interface CategoryInterface {
	Category create(Category category);
	Category update(long categoryId, Category category);
	List<Category> getAllCategory();
	String deleteCategory(long categoryId);
}
