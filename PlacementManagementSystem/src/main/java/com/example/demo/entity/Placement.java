package com.example.demo.entity;

//Entity class



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class Placement {
	@Id
	private Integer ID; // primary key
	private String Name;
	private String College;
	private String Date;
	private String Qualification;
	private Integer Year;

	// constructors
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Placement(Integer iD, String name, String college, String date, String qualification, Integer year) {
		super();
		ID = iD;
		Name = name;
		College = college;
		Date = date;
		Qualification = qualification;
		Year = year;
	}

	// getters and setters
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCollege() {
		return College;
	}

	public void setCollege(String college) {
		College = college;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public Integer getYear() {
		return Year;
	}

	public void setYear(Integer year) {
		Year = year;
	}

	// toString method
	@Override
	public String toString() {
		return "Placement [ID=" + ID + ", Name=" + Name + ", College=" + College + ", Date=" + Date + ", Qualification="
				+ Qualification + ", Year=" + Year + "]";
	}
}
