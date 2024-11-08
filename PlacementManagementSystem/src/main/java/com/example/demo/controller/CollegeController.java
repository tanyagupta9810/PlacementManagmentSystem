package com.example.demo.controller;


import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.College;
import com.example.demo.repository.CollegeRepository;
import com.example.demo.service.CollegeService;
import com.example.exceptions.CollegeNotFound;

@RestController

@CrossOrigin(origins="*")
public class CollegeController
{//DEPENDENCY INJECTION USING AUTOWIRING
 @Autowired
 private CollegeService service;//reference variable
 @Autowired
 private CollegeRepository repo;


 // RESTful API methods for Retrieval operations
 @GetMapping("/college")
 public List<College> list()
 {
 return service.listAll();
 }

 @GetMapping("/college/{id}")
 public ResponseEntity<College> get(@PathVariable Integer id)
 {
 try
 {
 College college = service.get(id);
 return new ResponseEntity<>(college, HttpStatus.OK);
 }

 catch(CollegeNotFound ex)
 {

	 return new ResponseEntity<>( HttpStatus.NOT_FOUND);
 }
 }

 //create or insert

 @PostMapping("/college")
 public void add(@RequestBody College college)
 {
 service.save(college);
 }



 @PutMapping("/college/{id}")
 public ResponseEntity<?> update(@RequestBody College college, @PathVariable Integer id)
 {
 try
 {
 College existCollege = service.get(id);
 service.save(college);
 return new ResponseEntity<>(HttpStatus.OK);
 }
 catch (NoSuchElementException e)
 {
 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 }
 }

 @DeleteMapping("/college/{id}")
 public void delete(@PathVariable Integer id) //extracting ID from the URL
 {
 service.delete(id);
 }
}