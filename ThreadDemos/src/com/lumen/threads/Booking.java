package com.lumen.threads;

public class Booking {

    public double bookTickets(String name,int noOfTickets) {

        double pricePerTicket=200;

        System.out.println("Booked for "+name);

        double totalPrice=pricePerTicket*noOfTickets;

//        System.out.println("Total Amount to be paid: "+totalPrice);

        return totalPrice;

    }

 

}