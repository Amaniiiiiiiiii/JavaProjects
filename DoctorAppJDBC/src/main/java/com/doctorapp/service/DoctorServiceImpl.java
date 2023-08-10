package com.doctorapp.service;

import java.util.List;

import com.doctorapp.dao.DoctorDaoImpl;
import com.doctorapp.dao.IDoctorDao;
import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public class DoctorServiceImpl implements IDoctorService{

	IDoctorDao doctorDao=new DoctorDaoImpl();
	
	
	@Override
	public void addDoctor(Doctor doctor) {
		doctorDao.addDoctor(doctor);
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		return 0;
	}

	@Override
	public Doctor getById(int doctorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Doctor> getAllDOctors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialty(String specialty) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialtyAndExp(String specialty, int experience) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialtyAndFees(String specialty, double fees) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
