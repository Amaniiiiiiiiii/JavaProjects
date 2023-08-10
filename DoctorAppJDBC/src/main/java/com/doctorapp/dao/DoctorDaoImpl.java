package com.doctorapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DbConnection;
import com.doctorapp.util.Queries;

public class DoctorDaoImpl implements IDoctorDao {

	@Override
	public void addDoctor(Doctor doctor)  {

		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);) {
			statement.setString(1, doctor.getDoctorName());
			statement.setInt(3, doctor.getExperience());
			statement.setDouble(4, doctor.getFees());
			statement.setString(2, doctor.getSpecialty());
			statement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.UPDATEQUERY);){
			statement.setInt(1, doctorId);
			statement.setDouble(2, fees);
			statement.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			DbConnection.closeConnection();
		}
	
	}

	@Override
	public Doctor findById(int doctorId) {
		return null;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.DELETEQUERY);){
			statement.setDouble(1, doctorId);
			statement.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			DbConnection.closeConnection();
		}
	}
	

	@Override
	public List<Doctor> findAllDoctors() {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement=connection.prepareStatement(Queries.QUERYALL);){
			ResultSet result = statement.executeQuery();
			List<Doctor> doctors = new ArrayList<Doctor>();
			while(result.next()) {
				Doctor doctor = new Doctor();
				doctor.setDoctorId(result.getInt(1));
				doctor.setDoctorName(result.getString(2));
				doctor.setSpecialty(result.getString(3));
				doctor.setExperience(result.getInt(4));
				doctor.setFees(result.getDouble(5));
				doctors.add(doctor);
			}
			return doctors;
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		
		
		finally {
			DbConnection.closeConnection();
		}
		return null;
		
		
		
	}

	@Override
	public List<Doctor> findBySpecialty(String specialty) throws DoctorNotFoundException {
		return null;
	}

	@Override
	public List<Doctor> findBySpecialtyAndExp(String specialty, int experience) throws DoctorNotFoundException {
		return null;
	}

	@Override
	public List<Doctor> findBySpecialtyAndFees(String specialty, double fees) throws DoctorNotFoundException {
		return null;
	}

}
