package com.oops.abs;

public class AbsMain {

	public static void main(String[] args) {
		Bank bank = new Branch1();//since it is abstract class we can call it using this way
		bank.admin();
		bank.carLoan();
		bank.eduLoan();
		bank.housingLoan();
		Branch1 branch1 = (Branch1) bank;//this is not abstract so not calling same as above
		branch1.staffDetails();

		bank = new SubBranch();
		bank.admin();
		bank.carLoan();//from subbranch if not available in sub classes it checked one up -->subbranch-->branch2-->bank
		bank.eduLoan();
		bank.housingLoan();
		
		SubBranch subbranch = (SubBranch) bank;//since bank is upper entity like superclass so it is downcasted here
		subbranch.loanType();
		subbranch.subPay();
		
		Branch2 branch2=subbranch;//since subbranch is already called it needn''t be defined again using new
		branch2.loanType();

	}

}
