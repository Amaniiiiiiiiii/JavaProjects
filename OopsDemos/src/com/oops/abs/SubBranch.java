package com.oops.abs;

public  class SubBranch extends Branch2 {

	@Override
	void carLoan() {
		System.out.println("Car loan in Sub branch");
	}
	void subPay() {
		System.out.println("Payment in sub branch");
	}
	
	@Override
	void eduLoan() {
		super.eduLoan();
		System.out.println("Education Loan in Branch2");
	}
	
}
