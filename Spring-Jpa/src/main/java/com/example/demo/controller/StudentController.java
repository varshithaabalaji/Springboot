package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Students;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	public StudentService service;
	
	@GetMapping("home")
	public String getHomePage() {
		return "Hello world";
	}
	
	@GetMapping("/get")
	public List<Students> showAll(){
		return service.findAll();
	}
	
	@GetMapping("/get/names")
	public List<String> getAllNames(){
		return service.getAllNames();
	}
	
	@PostMapping("/post")
	public Students createStudent(@RequestBody Students student) {
		return service.createStudent(student);
	}

}
