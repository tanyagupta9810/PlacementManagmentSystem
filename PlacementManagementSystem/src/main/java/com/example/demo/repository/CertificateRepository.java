package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Integer>{

}