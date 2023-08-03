package com.lumen.threads;

class RunChild implements Runnable {
	Booking booking;
	int tickets;
	String counterName;

	public RunChild(String counterName, Booking booking, int tickets) {
		super();
		this.booking = booking;
		this.tickets = tickets;
		this.counterName = counterName;
		Thread thread = new Thread(this, counterName);
		thread.start();
	}

	@Override
	public void run() {

//		String tname = Thread.currentThread().getName();
//        for(int i=0;i<5;i++)
//            System.out.println(tname+" "+i);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//		Booking booking = new Booking();
//
//		double amount = booking.bookTickets(tname, 10);
//
//		System.out.println("Amount to be paid by " + tname + ": " + amount);
		System.out.println(counterName);
		synchronized (booking) {
			double amount = booking.bookTickets(counterName, tickets);
			System.out.println(amount);
		}

	}
}

public class RunThread {

	public static void main(String[] args) {

		Booking booking = new Booking();
		RunChild child1 = new RunChild("Counter a", booking, 10);
		RunChild child2 = new RunChild("Counter b", booking, 100);
		RunChild child3 = new RunChild("Counter c", booking, 120);

//		RunChild child = new RunChild();
//		Thread thread1 = new Thread(child, "A");
//		thread1.start();
//		Thread thread2 = new Thread(child, "B");
//		thread2.start();

	}

}
