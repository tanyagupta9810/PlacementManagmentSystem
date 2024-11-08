package com.example.demo.entity;


import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity

public class User {

	@Id
	 private Integer id;
	 private String name;
	 private String type;
	 private String password;
	 public User() 
	 {
	 }
	 public User(Integer id, String name, String type, String password) 
	 {
	 this.id = id;
	 this.name = name;
	 this.type = type;
	 this.password=password;
	 }

	 
	 public Integer getId() 
	 {
	 return id;
	 }
	public void setId(Integer id) 
	{
	this.id = id;
	}
	public String getName() 
	{
	return name;
	}
	public void setName(String name) 
	{
	this.name = name;
	}
	public String getType() 
	{
	return type;
	}
	public void setType(String type) 
	{
	this.type = type;
	}
	public String getPassword() 
	{
	return type;
	}
	public void setPassword(String password) 
	{
	this.password = password;
	}
	@Override
	public String toString() 
	{
	return "Product [id=" + id + ", name=" + name + ", type=" + type + ",password="+password+"]";
	}
	 
}