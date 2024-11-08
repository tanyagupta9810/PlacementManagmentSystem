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

import com.example.demo.entity.Certificate;
import com.example.demo.repository.CertificateRepository;
import com.example.demo.service.CertificateService;
import com.example.exceptions.CertificateNotFound;

@RestController
@CrossOrigin(origins="*")

public class CertificateController {

	
	 @Autowired
	 private CertificateService service;//reference variable
	 @Autowired
	 private CertificateRepository repo;
	 
	 
	// RESTful API methods for Retrieval operations
	 
	 @GetMapping("/certificates")
	 public List<Certificate> list() 
	 {
	 return service.listAll();
	 }
	 
	 
	 @GetMapping("/certificates/{id}")
	 public ResponseEntity<Certificate> get(@PathVariable Integer id) 
	 {
	 try
	 {
	 Certificate certificate = service.get(id);
	
	return new ResponseEntity<Certificate>(certificate, HttpStatus.OK);
	 } 

	 catch(CertificateNotFound ex)
	 {
		
		 return new ResponseEntity<Certificate>( HttpStatus.NOT_FOUND);
	 }
	 }
	 
	 
	 
	//create or insert
	 
	 
	 @PostMapping("/certificates")
	 public void add(@RequestBody Certificate certificate) 
	 {
	 service.save(certificate);
	 }
	 
	 

	 @PutMapping("/certificates/{id}")
	 public ResponseEntity<?> update(@RequestBody Certificate certificate, @PathVariable Integer id) 
	 {
	 try
	 {
	 Certificate existproduct = service.get(id);
	 service.save(certificate);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }

	 @DeleteMapping("/certificates/{id}")
	 public void delete(@PathVariable Integer id) //extracting ID from the URL
	 {
	 service.delete(id);
	 }
	 
	 
}