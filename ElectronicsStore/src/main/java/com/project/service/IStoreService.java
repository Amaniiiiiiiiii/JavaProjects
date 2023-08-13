package com.project.service;

import java.sql.SQLException;
import java.util.List;

import com.project.exception.CategoryNotFoundException;
import com.project.exception.ManufacturerNotFoundException;
import com.project.exception.ProductIdNotFoundException;
import com.project.exception.ProductNotFoundException;
import com.project.model.Store;

public interface IStoreService {

	void addProduct(Store store) throws SQLException;

	void updateProductPrice(int productId, double price) throws SQLException;
	
	void updateProductManufacturer(int productId, String productManufacturer) throws SQLException;

	void deleteProduct(int productId) throws SQLException;

	List<Store> getAll() throws SQLException,ProductNotFoundException;
	

	List<Store> getByProductManufacturer(String productManufacturer) throws CategoryNotFoundException, SQLException, ManufacturerNotFoundException;

	List<Store> getByProductCategory(String category) throws CategoryNotFoundException, SQLException;

	List<Store> getByPriceLessThan(double price) throws ProductNotFoundException, SQLException;

	List<Store> getByManufacturerAndCategory(String productManufacturer, String category) throws CategoryNotFoundException,ManufacturerNotFoundException, SQLException;

	Store getByProductId(int productId) throws ProductIdNotFoundException, SQLException,ProductNotFoundException;

	
}
