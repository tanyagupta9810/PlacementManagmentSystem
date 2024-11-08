package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Placement;
import com.example.demo.repository.PlacementRepository;
import com.example.demo.service.PlacementService;
import com.example.exceptions.PlacementNotFound;


@RestController

public class PlacementController {

	@Autowired
	private PlacementService service; // reference variable
	@Autowired
	private PlacementRepository repo;

	// RESTful API methods for Retrieval operations
	@GetMapping("/placements")
	public List<Placement> List()
	{
		return service.listAll();
	}

	@GetMapping("/placements/{id}")
	public ResponseEntity<Placement> get(@PathVariable Integer id)
	{
		try {
			Placement placement = service.get(id);
			return new ResponseEntity<>(placement, HttpStatus.OK);
		}
		catch(PlacementNotFound ex) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// create or insert

	@PostMapping("/placements")
	public void add(@RequestBody Placement placement)
	{
		service.save(placement);
	}


	@PutMapping("/placements/{id}")
	public ResponseEntity<?> update (@RequestBody Placement placement, @PathVariable Integer id)
	{
		try {
			Placement existPlacement = service.get(id);
			service.save(existPlacement);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


	@DeleteMapping("/placements/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
}