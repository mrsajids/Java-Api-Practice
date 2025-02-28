package com.example.demo.controller;

import com.example.demo.model.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class MyControllers {
	private List<Person> people = new ArrayList<>();  // List to hold people
	
	@GetMapping("/all")
	public List<Person> getAllPerson() {
		return people;
	}

}
