package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.project.exception.CategoryNotFoundException;
import com.project.exception.ManufacturerNotFoundException;
import com.project.exception.ProductIdNotFoundException;
import com.project.exception.ProductNotFoundException;
import com.project.model.Store;
import com.project.util.Queries;

public class StoreDaoImpl implements IStoreDao{


	@Override
	public void addProduct(Store store) throws SQLException {
		try (Connection connection=DbConnection.openConnection();
				PreparedStatement statement= connection.prepareStatement(Queries.INSERTQUERY);){
				statement.setInt(1, store.getProductId());
				statement.setString(2, store.getProductName());
				statement.setString(3, store.getProductCategory());
				statement.setString(4, store.getProductManufacturer());
				statement.setDouble(5, store.getPrice());
				boolean flag=statement.execute();
				System.out.println(flag);
		
		}finally {
			DbConnection.closeConnection();
		}
		
		
	}

	@Override
	public void updateProductPrice(int productId, double price) throws SQLException {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.UPDATEPRICEQUERY);) {
			statement.setDouble(1, price);
			statement.setInt(2, productId);
			statement.execute();
		} finally {
			DbConnection.closeConnection();
		}
		
	}

	@Override
	public void updateProductManufacturer(String productManufacturer, int productId) throws SQLException {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.UPDATEPRICEQUERY);) {
			statement.setString(1, productManufacturer);
			statement.setInt(2, productId);
			statement.execute();
		} finally {
			DbConnection.closeConnection();
		}
		
	}

	@Override
	public void deleteProduct(int productId) throws SQLException {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.DELETEQUERY);) {
			statement.setInt(1, productId);
			statement.execute();
		} finally {
			DbConnection.closeConnection();
		}
	}

	@Override
	public List<Store> findAll() throws SQLException {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYALL);) {
			ResultSet result = statement.executeQuery();
			List<Store> store = new ArrayList<Store>();
			while (result.next()) {
				Store storee = new Store();
				storee.setProductId(result.getInt(1));
				storee.setProductName(result.getString(2));
				storee.setProductManufacturer(result.getString(3));
				storee.setProductCategory(result.getString(4));
				storee.setPrice(result.getDouble(5));
				store.add(storee);
			}
			return store;
		} finally {
			DbConnection.closeConnection();
		}
	
	
	}

	@Override
	public List<Store> findByProductManufacturer(String productManufacturer)
			throws CategoryNotFoundException, SQLException {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYPRODUCTMANUFACTURER);) {
			statement.setString(1, productManufacturer);
			ResultSet result = statement.executeQuery();
			List<Store> store = new LinkedList<>();
			while (result.next()) {
				Store storee = new Store();
				storee.setProductId(result.getInt(1));
				storee.setProductName(result.getString(2));
				storee.setProductManufacturer(result.getString(3));
				storee.setProductCategory(result.getString(4));
				storee.setPrice(result.getDouble(5));
				store.add(storee);
			}
			return store;
		} finally {
			DbConnection.closeConnection();
		}
	
	}

	@Override
	public List<Store> findByProductCategory(String category) throws CategoryNotFoundException, SQLException {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYPRODUCTCATEGORY);) {
			statement.setString(1, category);
			ResultSet result = statement.executeQuery();
			List<Store> store = new LinkedList<>();
			while (result.next()) {
				Store storee = new Store();
				storee.setProductId(result.getInt(1));
				storee.setProductName(result.getString(2));
				storee.setProductManufacturer(result.getString(3));
				storee.setProductCategory(result.getString(4));
				storee.setPrice(result.getDouble(5));
				store.add(storee);
			}
			return store;
		} finally {
			DbConnection.closeConnection();
		}
	}

	@Override
	public List<Store> findByPriceLessThan(double price) throws ProductNotFoundException, SQLException {
		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYPRICELESSTHAN);) {
			statement.setDouble(1, price);
			ResultSet result = statement.executeQuery();
			List<Store> store = new LinkedList<>();
			while (result.next()) {
				Store storee = new Store();
				storee.setProductId(result.getInt(1));
				storee.setProductName(result.getString(2));
				storee.setProductManufacturer(result.getString(3));
				storee.setProductCategory(result.getString(4));
				storee.setPrice(result.getDouble(5));
				store.add(storee);
			}
			return store;
		} finally {
			DbConnection.closeConnection();
		}	}

	@Override
	public List<Store> findByManufacturerAndCategory(String productManufacturer, String productCategory)
			throws CategoryNotFoundException, ManufacturerNotFoundException, SQLException {

		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYMANUFACTURERANDCATEGORY);) {
			statement.setString(1, productManufacturer);
			statement.setString(2, productCategory);
			
			ResultSet result = statement.executeQuery();
			List<Store> store = new LinkedList<>();
			while (result.next()) {
				Store storee = new Store();
				storee.setProductId(result.getInt(1));
				storee.setProductName(result.getString(2));
				storee.setProductManufacturer(result.getString(3));
				storee.setProductCategory(result.getString(4));
				storee.setPrice(result.getDouble(5));
				store.add(storee);
			}
			return store;
		} finally {
			DbConnection.closeConnection();
		}
	
	
	}

	@Override
	public Store findByProductId(int productId)
			throws ProductIdNotFoundException, SQLException, ProductNotFoundException {

		try (Connection connection = DbConnection.openConnection();
				PreparedStatement statement = connection.prepareStatement(Queries.QUERYBYPRODUCTID);) {
			statement.setInt(1, productId);
			ResultSet result = statement.executeQuery();
			Store store = null;
			while (result.next()) {
				store = new Store();
				store.setProductId(result.getInt(1));
				store.setProductName(result.getString(2));
				store.setProductManufacturer(result.getString(3));
				store.setProductCategory(result.getString(4));
				store.setPrice(result.getDouble(5));
			}
			return store;
		} finally {
			DbConnection.closeConnection();
		}
	}

	
	
	
	
	
}
