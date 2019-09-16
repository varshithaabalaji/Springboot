package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Students;
import com.example.demo.repository.Studentrepo;

@Service
public class StudentServiceImp implements StudentService {

	
	@Autowired
	public Studentrepo repository;
	
	public List<Students> findAll(){
		return repository.findAll();
	}
	
	public List<String> getAllNames(){
		return repository.getAllNames();
	}
	
	public Students createStudent(Students student) {
		return repository.save(student);
	}
}
