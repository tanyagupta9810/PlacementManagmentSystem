package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class UserService {

	
	@Autowired
	 private UserRepository repo;// no new operator
	 
	 public List<User> listAll() //RETRIEVE
	 {
	 return repo.findAll();
	 }
	 
	 public void save(User product) //CREATE OR INSERT
	 {
	 repo.save(product);
	 }
	 
	 public User get(Integer id) //RETRIEVE ON THE BASIS OF ID
	 {
	 return repo.findById(id).get();
	 }
	 
	 public void delete(Integer id) 
	 {
	 repo.deleteById(id);
	 }
	 
}