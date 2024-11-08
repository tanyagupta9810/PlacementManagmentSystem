package com.example.demo.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.exceptions.UserNotFound;

@RestController

@CrossOrigin(origins="*")

public class UserController {

	 @Autowired
	 private UserService service;//reference variable
	 @Autowired
	 private UserRepository repo;
	 
	 
	 // RESTful API methods for Retrieval operations
	 @GetMapping("/user")     
	 public List<User> list() 
	 {
	 return service.listAll();
	 }
	 
	 
	 
	 @GetMapping("/user/{id}")
	 public ResponseEntity<User> get(@PathVariable Integer id) 
	 {
	 try
	 {
	 User product = service.get(id);
	 return new ResponseEntity<User>(product, HttpStatus.OK);
	 } 

	 catch(UserNotFound ex)
	 {
		
		 return new ResponseEntity<User>( HttpStatus.NOT_FOUND);
	 }
	 }
	 
	 
	 
	 
	 //create or insert

	 @PostMapping("/user")
	 public void add(@RequestBody User product) 
	 {
	 service.save(product);
	 }
	 
	 

	 @PutMapping("/user/{id}")
	 public ResponseEntity<?> update(@RequestBody User product, @PathVariable Integer id) 
	 {
	 try
	 {
	 User existproduct = service.get(id);
	 service.save(product);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }

	 @DeleteMapping("/user/{id}")
	 public void delete(@PathVariable Integer id) //extracting ID from the URL
	 {
	 service.delete(id);
	 }
}