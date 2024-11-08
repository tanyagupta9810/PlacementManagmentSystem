package com.example.demo.entity;

//Entity Class
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
	@Id
	private Integer id;
	private String college_Admin;
	private String college_Name;
	private String location;



	//Constructor
	public College() {
		super();
	}

	public College(Integer id, String college_Admin, String college_Name, String location) {
		super();
		this.id = id;
		this.college_Admin = college_Admin;
		this.college_Name = college_Name;
		this.location = location;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCollege_Admin() {
		return college_Admin;
	}
	public void setCollege_Admin(String college_Admin) {
		this.college_Admin = college_Admin;
	}
	public String getCollege_Name() {
		return college_Name;
	}
	public void setCollege_Name(String college_Name) {
		this.college_Name = college_Name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", college_Admin=" + college_Admin + ", college_Name=" + college_Name
				+ ", location=" + location + "]";
	}




}