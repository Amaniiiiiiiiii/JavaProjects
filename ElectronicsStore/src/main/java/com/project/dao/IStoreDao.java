package com.project.dao;

	import java.sql.SQLException;
	import java.util.List;
	import com.project.exception.ProductIdNotFoundException;
	import com.project.exception.CategoryNotFoundException;
import com.project.exception.ManufacturerNotFoundException;
import com.project.exception.ProductNotFoundException;
	import com.project.model.Store;

	public interface IStoreDao {
		void addProduct(Store store) throws SQLException;

		void updateProductPrice(int productId, double price) throws SQLException;
		
		void updateProductManufacturer( String productManufacturer,int productId) throws SQLException;

		void deleteProduct(int productId) throws SQLException;

		List<Store> findAll() throws SQLException;
		

		List<Store> findByProductManufacturer(String ProductManufacturer) throws CategoryNotFoundException, SQLException;

		List<Store> findByProductCategory(String category) throws CategoryNotFoundException, SQLException;

		List<Store> findByPriceLessThan(double price) throws ProductNotFoundException, SQLException;

		List<Store> findByManufacturerAndCategory(String productManufacturer, String category) throws CategoryNotFoundException,ManufacturerNotFoundException, SQLException;

		Store findByProductId(int productId) throws ProductIdNotFoundException, SQLException,ProductNotFoundException;
	}
	
	

