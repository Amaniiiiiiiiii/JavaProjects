package com.doctorapp.service;

import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorService {

	void addDoctor(Doctor doctor);
	
	int updateDoctor(int doctorId,double fees);
	Doctor getById(int doctorId);
	void deleteDoctor(int doctorId);
	List<Doctor> getAllDOctors();
	
	List<Doctor> getBySpecialty(String specialty) throws DoctorNotFoundException;
	List<Doctor> getBySpecialtyAndExp(String specialty, int experience) throws DoctorNotFoundException;
	List<Doctor> getBySpecialtyAndFees(String specialty, double fees) throws DoctorNotFoundException;
	
	
}
