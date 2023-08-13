package com.project.util;

public class Queries {

	
		public static final String CREATEQUERY = "create table if not exists store(productId int primary key,"
				+ "productName varchar(40) not null, productManufacturer varchar(20) not null, productCategory varchar(20), price double);";
		public static final String INSERTQUERY = "insert into store(productId,productName,productManufacturer,productCategory,price) values(?,?,?,?,?);";
		public static final String UPDATEPRICEQUERY = "update store set price=? where productId =?;";
		public static final String UPDATEMANUFACTURERQUERY = "update store set productManufacturer=? where productId =?;";
		public static final String DELETEQUERY = "delete from store where productId=?;";

		public static final String QUERYALL = "select * from store;";
		public static final String QUERYBYPRODUCTID = "select * from store where productId=?;";
		public static final String QUERYBYPRODUCTMANUFACTURER = "select * from store where productManufacturer like CONCAT( '%',?,'%');";
		public static final String QUERYBYPRODUCTCATEGORY = "select * from store where productCategory=CONCAT(?);";
		public static final String QUERYBYMANUFACTURERANDCATEGORY = "select * from store where productManufacturer like CONCAT( '%',?,'%') and productCategory=CONCAT(?);";
		public static final String QUERYBYPRICELESSTHAN = "select * from store where price<?;";
	}
	
