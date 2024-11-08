package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Certificate;
import com.example.demo.repository.CertificateRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class CertificateService {
	
	@Autowired
    
	private CertificateRepository repo;
	
	public List<Certificate> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Certificate get(Integer id) {
		// TODO Auto-generated method stub
		return  repo.findById(id).get();
	}

	public void save(Certificate certificate) {
		// TODO Auto-generated method stub
		repo.save(certificate);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}