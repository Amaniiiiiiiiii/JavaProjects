package com.project.client;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

import com.project.exception.CategoryNotFoundException;
import com.project.exception.ManufacturerNotFoundException;
import com.project.exception.ProductNotFoundException;
import com.project.exception.*;
import com.project.model.Store;
import com.project.dao.*;
import com.project.service.IStoreService;
import com.project.service.StoreServiceImpl;

public class StoreApp {

	public static void main(String[] args) {
		IStoreService storeService = new StoreServiceImpl();

		String mainMenu;
		String subMenu;
		int productId;
		String productName;
		String productManufacturer;
		String productCategory;
		double price;

		System.out.println("Welcome to Girias Electronics Store");
		try (Scanner scanner = new Scanner(System.in);) {
			while (true) {
				System.out.println("\nMain Menu");
				System.out.print(
						"1.List all products\n2.Add product\n3.Browse Inventory\n4.Update price\n5.Delete Product\n6.Exit\nChoice : ");
				mainMenu = scanner.nextLine();
				switch (mainMenu) {
				case "1":
					List<Store> storee = new ArrayList<>();
					try {
						storee = storeService.getAll();
						System.out.println("\nProducts in the Store");
						for (Store product : storee)
							System.out.println(product);
					} catch (ProductNotFoundException | SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
				case "2":
					System.out.println("Enter product Details");
					System.out.print("Product Name: ");
					productName = scanner.nextLine();
					System.out.print("Product Manufacturer: ");
					productManufacturer = scanner.nextLine();
					System.out.print("Category: ");
					productCategory = scanner.nextLine();
					System.out.print("Product Id: ");
					productId = scanner.nextInt();
					System.out.print("Price: ");
					price = scanner.nextDouble();
					scanner.nextLine();
					try {
						storeService.addProduct(
								new Store(productId, productName, productManufacturer, productCategory, price));
					} catch (SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
				case "3":
					boolean flag = true;
					while (flag) {
						System.out.print(
								"\n1.Browse by Manufacturer\n2.Browse by Product Category\n3.Browse by price\n4.Browse Manufacturer and category\n5.Browse by ProductId\n6.Main menu");
						System.out.print("\nChoice: ");
						subMenu = scanner.nextLine();
						switch (subMenu) {
						case "1":
							System.out.print("Enter the Manufacturer: ");
							productManufacturer = scanner.nextLine();
							List<Store> productByManufacturer = new ArrayList<>();
							try {
								try {
									productByManufacturer = storeService.getByProductManufacturer(productManufacturer);
								} catch (CategoryNotFoundException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								if (productByManufacturer != null) {
									System.out.println("Stores with author name containing " + productManufacturer + " are: ");
									productByManufacturer.forEach(System.out::println);
								}
							} catch (ManufacturerNotFoundException | SQLException e) {
								System.out.println(e.getMessage());
							}
							break;
						case "2":
							System.out.print("Enter the Category: ");
							productCategory = scanner.nextLine();
							List<Store> productByCategory;
							try {
								productByCategory = storeService.getByProductCategory(productCategory);
								if (productByCategory != null) {
									System.out.println("Stores in " + productCategory + " are: ");
									productByCategory.forEach(System.out::println);
								}
							} catch (CategoryNotFoundException | SQLException e) {
								System.out.println(e.getMessage());
							}
							break;
						case "3":
							System.out.print("Enter the price: ");
							price = scanner.nextDouble();
							scanner.nextLine();
							List<Store> productByPrice;
							try {
								productByPrice = storeService.getByPriceLessThan(price);
								if (productByPrice != null) {
									System.out.println("Stores with price less than " + price + " rupees: ");
									productByPrice.forEach(System.out::println);
								}
							} catch (ProductNotFoundException | SQLException e) {
								System.out.println(e.getMessage());
							}
							break;
						case "4":
							System.out.print("Enter the Manufacturer: ");
							productManufacturer = scanner.nextLine();
							System.out.print("Enter the Category: ");
							productCategory = scanner.nextLine();
							List<Store> productByManufacturerAndCategory;
							try {
								productByManufacturerAndCategory = storeService.getByManufacturerAndCategory(productManufacturer,
										productCategory);
								if (productByManufacturerAndCategory != null) {
									System.out.println("Products By Manufacturer " + productManufacturer
											+ " and Category " + productCategory);
									productByManufacturerAndCategory.forEach(System.out::println);
								}
							} catch (ManufacturerNotFoundException|CategoryNotFoundException | SQLException e) {
								System.out.println(e.getMessage());
							}
							break;
						case "5":
							System.out.print("Enter the book Id: ");
							productId = scanner.nextInt();
							scanner.nextLine();
							Store store;
							try {
								store = storeService.getByProductId(productId);
								if (store != null) {
									System.out.println("Product with Id: " + productId);
									System.out.println(store.toString());
								}
							} catch (ProductIdNotFoundException | SQLException | ProductNotFoundException e ) {
								System.out.println(e.getMessage());
							}
							break;
						case "6":
							flag = false;
							break;
						default:
							System.out.println("Enter valid choice: ");
						}
					}
					break;
				case "4":
					System.out.println("Enter the StoreId: ");
					productId = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter the new price: ");
					price = scanner.nextDouble();
					scanner.nextLine();
					try {
						storeService.updateProductPrice(productId, price);
					} catch (SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
				case "5":
					System.out.println("Enter the StoreId: ");
					productId = scanner.nextInt();
					scanner.nextLine();
					try {
						storeService.deleteProduct(productId);
					} catch (SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
				case "6":
					System.out.println("Thank You. Visit Again");
					System.exit(0);
				default:
					System.out.println("Enter valid choice");
				}
			}
		}

	}

}
