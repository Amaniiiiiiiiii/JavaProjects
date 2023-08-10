package com.doctorapp.util;

public class Queries {

	public static final String CREATEQUERY = "create table if not exists doctor(doctorName varchar(40) not null,doctorId int primary key auto_increment,"
			+ " specialty varchar(20) , experience int, fees double);";
	public static final String INSERTQUERY = "insert into doctor(doctorName,doctorId,specialty,experience,fees) values(?,?,?,?,?);";
	public static final String UPDATEQUERY = "update doctor set fees=? where doctorId =?;";
	public static final String DELETEQUERY = "delete from books where bookId=?;";

	public static final String QUERYALL="select * from doctor";
	public static final String QUERYBYID="";
	public static final String QUERYBYSPECIALTY="";
	public static final String QUERYBYSPECIALTYEXP="";
	
	
}
