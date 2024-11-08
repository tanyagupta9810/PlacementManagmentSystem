package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Placement;
import com.example.demo.repository.PlacementRepository;

@Service
@Transactional
public class PlacementService {  // CRUD

	@Autowired
	private PlacementRepository repo;

	public List<Placement> listAll() // Retrieve
	{
		return repo.findAll();
	}

	public void save (Placement placement)  // create or insert
	{
		repo.save(placement);  // insert query
	}

	public Placement get(Integer id) // Retrieve on basis of id
	{
		return repo.findById(id).get();
	}

	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}