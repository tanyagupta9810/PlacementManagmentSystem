package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificate {


@Id
 private Integer id;
 private int year;
 private String college;
 
 public Certificate() 
 {
 }
 
 public Certificate(Integer id,int year, String college) 
 {
 this.id = id;
 this.setYear(year);
 this.setCollege(college);
 }

 
 
 public Integer getId() 
 {
 return id;
 }
public void setId(Integer id) 
{
this.id = id;
}
 
public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public String getCollege() {
	return college;
}

public void setCollege(String college) {
	this.college = college;
}


@Override
	public String toString() {
		return "Certificate [id=" + id + ", year=" + year + ", college=" + college + "]";
	}
}