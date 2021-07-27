package com.ntfmovies.moviesapi.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netfmovies.moviesapi.model.Category;
import com.ntfmovies.moviesapi.service.CategoryService;


@RestController
public class MoviesController {
    @Autowired
    CategoryService categoryservice;
	@GetMapping("/categories")
	List<Category> getCategories(){
		return categoryservice.getCategories();
		
	}
}
