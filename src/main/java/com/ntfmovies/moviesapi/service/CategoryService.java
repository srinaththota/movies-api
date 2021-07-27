package com.ntfmovies.moviesapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.netfmovies.moviesapi.model.Category;

@Service
public class CategoryService {
public List<Category> getCategories(){
	return Arrays.asList(new Category(1,"Horror","HR"));
}
}
