package com.project.studententity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="student")
public class Student {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
	
	@Column(name="student_name")
    private String studentname;
	
	@Column(name="City")
	private String city;
	
	@Column(name="State")
	private String state;
	
	@Column(name="Pincode")
	private int pincode;
	
	@Column(name="BloodGroup")
	private String bloodGroup;

	@Column(name="percent")
    private int percentage;
	
	@Column(name="mailid")
    private String mailid;
	
	@Column(name="college")
    private String college;
	
	@Column(name="qualification")
    private String qualification;
	
    
	public Student() {
 
	}


	public Student(Long id, String studentname, String city, String state, int pincode, String bloodGroup,
			int percentage, String mailid, String college, String qualification) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.bloodGroup = bloodGroup;
		this.percentage = percentage;
		this.mailid = mailid;
		this.college = college;
		this.qualification = qualification;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getStudentname() {
		return studentname;
	}


	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public int getPercentage() {
		return percentage;
	}


	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}


	public String getMailid() {
		return mailid;
	}


	public void setMailid(String mailid) {
		this.mailid = mailid;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	}