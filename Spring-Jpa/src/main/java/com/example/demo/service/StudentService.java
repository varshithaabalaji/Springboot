package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Students;

@Service
public interface StudentService {

		public List<Students> findAll();
		
		public List<String> getAllNames();
		
		public Students createStudent(Students student);
}
