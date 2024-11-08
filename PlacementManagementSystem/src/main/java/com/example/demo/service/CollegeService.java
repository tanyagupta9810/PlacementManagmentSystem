package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.College;
import com.example.demo.repository.CollegeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CollegeService //CRUD
{
 @Autowired
 private CollegeRepository repo;// no new operator

 public List<College> listAll() //RETRIEVE
 {
 return repo.findAll();
 }

 public void save(College college) //CREATE OR INSERT
 {
 repo.save(college);
 }

 public College get(Integer id) //RETRIEVE ON THE BASIS OF ID
 {
 return repo.findById(id).get();
 }

 public void delete(Integer id)
 {
 repo.deleteById(id);
 }
}