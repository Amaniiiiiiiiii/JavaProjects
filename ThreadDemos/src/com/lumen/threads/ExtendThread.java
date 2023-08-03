package com.lumen.threads;

//creating threads by extending
class Child extends Thread{

	@Override
	public void run() {
		String tname=Thread.currentThread().getName();
		for(int i=0;i<5;i++){
			System.out.println(tname+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}


public class ExtendThread {
	
	public static void main(String[] args) {
		
		Thread child1= new Child();
		child1.setName("Poppy");
		child1.setPriority(Thread.MAX_PRIORITY);
		Thread child2= new Child();
		child2.setName("Jo");
		child2.setPriority(Thread.MIN_PRIORITY+2);
		Thread child3= new Child();
		child3.setName("Ko");
		child3.setPriority(Thread.NORM_PRIORITY+3);
		child1.start();
		child2.start();
		child3.start();
		
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
