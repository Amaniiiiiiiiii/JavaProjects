package com.doctorapp.model;

public class Doctor {
private String doctorName;
private Integer doctorId;
private String specialty;
private double fees;
private int experience;



public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}
public Doctor(String doctorName,  String specialty, double fees, int experience) {
	super();
	this.doctorName = doctorName;
	this.specialty = specialty;
	this.fees = fees;
	this.experience = experience;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public Integer getDoctorId() {
	return doctorId;
}
public void setDoctorId(Integer doctorId) {
	this.doctorId = doctorId;
}
public String getSpecialty() {
	return specialty;
}
public void setSpecialty(String specialty) {
	this.specialty = specialty;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
@Override
public String toString() {
	return "Doctor [doctorName=" + doctorName + ", doctorId=" + doctorId + ", specialty=" + specialty + ", fees=" + fees
			+ ", experience=" + experience + "]";
}





	
	
	
}
