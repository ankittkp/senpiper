package com.senpiper.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Convert;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity(name="db_trainingcentre")
public class TrainingCentre {
	
	@Size(max=40)
	private String centreName;
	public String getCentreName() {
		return centreName;
	}
	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}
	
	
	@Embedded
	private Address address;
	
	@Id
	@Size(message="exactly 12 character alphanumeric",min=12,max=12)
	private String centreCode;
	public String getCentreCode() {
		return centreCode;
	}
	public void setCentreCode(String centreCode) {
		this.centreCode = centreCode;
	}
	
	
	
	private long studentCapacity;
	public long getStudentCapacity() {
		return studentCapacity;
	}
	public void setStudentCapacity(long studentCapacity) {
		this.studentCapacity = studentCapacity;
	}
	
	@Convert(converter=stringToListConverter.class)
	private List<String>coursesOffered;
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
	
	
	@Size(max=10,min=10)
	private String contactPhone;
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	

}
