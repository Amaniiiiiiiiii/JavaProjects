package com.doctorapp.dao;

import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorDao {

void addDoctor(Doctor doctor);
	
	void updateDoctor(int doctorId,double fees);
	Doctor findById(int doctorId);
	void deleteDoctor(int doctorId);
	
	List<Doctor> findAllDoctors();
	List<Doctor> findBySpecialty(String specialty) throws DoctorNotFoundException;
	List<Doctor> findBySpecialtyAndExp(String specialty, int experience) throws DoctorNotFoundException;
	List<Doctor> findBySpecialtyAndFees(String specialty, double fees) throws DoctorNotFoundException;
	
	
}
