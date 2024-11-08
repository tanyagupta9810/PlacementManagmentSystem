package com.example.demo.entity;


//Entity class

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {

	@Id
	private Integer id;
	private String Name;
	//change to original
	private int College;
	private long Roll_No;
	private String qualification;
	private String course;
	private int year;
	//change to originala
	private int Certificate;
	private long Hall_Ticket_No;

	//getter and setter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCollege() {
		return College;
	}
	public void setCollege(int college) {
		College = college;
	}
	public long getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(long roll_No) {
		Roll_No = roll_No;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCertificate() {
		return Certificate;
	}
	public void setCertificate(int certificate) {
		Certificate = certificate;
	}
	public long getHall_Ticket_No() {
		return Hall_Ticket_No;
	}
	public void setHall_Ticket_No(long hall_Ticket_No) {
		Hall_Ticket_No = hall_Ticket_No;
	}


	//Constructor
	public Students() {
		super();
	}
	public Students(Integer id, String name, int college, long roll_No, String qualification, String course, int year,
			int certificate, long hall_Ticket_No) {
		super();
		this.id = id;
		Name = name;
		College = college;
		Roll_No = roll_No;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		Certificate = certificate;
		Hall_Ticket_No = hall_Ticket_No;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", College=" + College + ", Roll_No=" + Roll_No
				+ ", qualification=" + qualification + ", course=" + course + ", year=" + year + ", Certificate="
				+ Certificate + ", Hall_Ticket_No=" + Hall_Ticket_No + "]";
	}





}
