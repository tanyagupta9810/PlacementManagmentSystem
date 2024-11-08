package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Students;
import com.example.demo.repository.StudentsRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentsService  //CRUD
{
	@Autowired
	private StudentsRepository repo;

	public List<Students> listAll()//Retrieve operation
	{
		return repo.findAll();
	}

	public void save(Students student) //Create or Insert
	{
		repo.save(student);
	}

	public Students get(Integer id)//Retrieve on base of id
	{
		return repo.findById(id).get();
	}
	public void delete(Integer id) //Delete operation
	{
		repo.deleteById(id);
	}



}
