package com.senpiper.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Convert;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity(name="table_tc")
public class TrainingCentre {
	
	@NotEmpty(message="NOT NULL")
	@Size(max = 40)
	private String centerName;
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	@NotEmpty(message="NOT NULL")
	@Size(min=12,max=12,message = "exactly 12 character alphanumeric")
	@Id
	private String centerCode;
	public String getCenterCode() {
		return centerCode;
	}
	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}
	@Embedded 
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private Long studentCapacity;
	public Long getStudentCapacity() {
		return studentCapacity;
	}
	public void setStudentCapacity(Long studentCapacity) {
		this.studentCapacity = studentCapacity;
	}
	@Convert(converter = StringToListConverter.class)
	private List<String> coursesOffered;
	public List<String> getCoursesOffered() {
		return coursesOffered;
	}
	public void setCoursesOffered(List<String> coursesOffered) {
		this.coursesOffered = coursesOffered;
	}
	
	private String createdOn;
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	@Email
	private String contactEmail;
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	@NotEmpty(message="NOT NULL")
	@Size(min=10,max=10)
	private String contactPhone;
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	

}
