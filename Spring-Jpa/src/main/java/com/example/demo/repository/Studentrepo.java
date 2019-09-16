package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Students;

@Repository
public interface Studentrepo extends JpaRepository<Students, Integer> {
	
	@Query("select u.name from #{#entityName} u ")
	  List<String> getAllNames();
}
