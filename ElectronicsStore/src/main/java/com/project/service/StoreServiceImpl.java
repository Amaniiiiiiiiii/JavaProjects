package com.project.service;

import java.sql.SQLException;
import java.util.List;

import com.project.exception.CategoryNotFoundException;
import com.project.exception.ManufacturerNotFoundException;
import com.project.exception.ProductIdNotFoundException;
import com.project.exception.ProductNotFoundException;
import com.project.model.Store;
import com.project.dao.*;

public class StoreServiceImpl implements IStoreService {

	IStoreDao storeDao=new StoreDaoImpl();

	@Override
	public void addProduct(Store store) throws SQLException {
		storeDao.addProduct(store);
	}

	@Override
	public void updateProductPrice(int productId, double price) throws SQLException {
		storeDao.updateProductPrice(productId, price);
	}

	@Override
	public void updateProductManufacturer(int productId, String productManufacturer) throws SQLException {
		storeDao.updateProductManufacturer(productManufacturer, productId);
	}

	@Override
	public void deleteProduct(int productId) throws SQLException {
		storeDao.deleteProduct(productId);
	}

	
	@Override
	public List<Store> getAll() throws SQLException, ProductNotFoundException {
		List<Store> store=storeDao.findAll();
		if(store.isEmpty())
			throw new ProductNotFoundException("No such product in database");
		return store;
	}

	@Override
	public List<Store> getByProductManufacturer(String productManufacturer)
			throws CategoryNotFoundException,ManufacturerNotFoundException, SQLException {
		
		List<Store> store=storeDao.findByProductManufacturer(productManufacturer);
		if(store.isEmpty()) 
			throw new ManufacturerNotFoundException("Manufacture not enrolled with us");
		
		return store;
	}

	@Override
	public List<Store> getByProductCategory(String category) throws CategoryNotFoundException, SQLException {
		List<Store> store=storeDao.findByProductCategory(category);
		if(store.isEmpty())
		    throw new CategoryNotFoundException("Oops! Looks like we don't have this category");
		return store;
	}

	@Override
	public List<Store> getByPriceLessThan(double price) throws ProductNotFoundException, SQLException {
		List<Store> store=storeDao.findByPriceLessThan(price);
		if(store.isEmpty())
		    throw new ProductNotFoundException("Sorry no products found within this range");
		return store;
	}

	@Override
	public List<Store> getByManufacturerAndCategory(String productManufacturer, String category)
			throws CategoryNotFoundException, ManufacturerNotFoundException, SQLException {
		List<Store> store=storeDao.findByManufacturerAndCategory(productManufacturer, category);
		if(store.isEmpty())
		    throw new CategoryNotFoundException("Sorry no such manufacturer in the category exists with us");
		return store;
	}

	@Override
	public Store getByProductId(int productId)
			throws ProductIdNotFoundException, SQLException, ProductNotFoundException {

		Store store=storeDao.findByProductId(productId);
		if(store==null)
		    throw new ProductIdNotFoundException("Product not found with id "+ productId);
		return store;
	}
}
