package com.StudentAdmission.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="students")

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	@Column(length=20,nullable=false)
	private String firstName;
	@Column(length=20,nullable=false)
	private String lastName;
	@Column(length=30,nullable=false, unique=true)
	private String email;
	@Column(length=11, nullable = false, unique = true)
	private Long phone;
	@Column(length=20,nullable=false)
	private String city;
	@Column(length=20,nullable=false)
	private String course;

public Student() {}

public Long getId() {
	return id;
}
public void setId(long id) {
	this.id = (long) id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getPhone() {
	return phone;
}
public void setPhone(Long phone) {
	this.phone = phone;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public Student(String firstName, String lastName, String email, Long phone, String city, String course) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phone = phone;
	this.city = city;
	this.course = course;
}


}
