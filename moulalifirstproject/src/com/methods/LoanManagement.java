package com.methods;

public class LoanManagement {
	 String customerName;
	 double LoanAmount;
	 double interestRate;
	 int Loantenure;
	 
	 //Accept loanAmount and interestRate as arguments.
	// Calculate and return the simple interest.
	 double calculateInterest( double LoanAmount , double interestRate ) {
		 double totalinterest= (LoanAmount * interestRate * Loantenure)/100;
		 return totalinterest;
	 }
	 double calculateTotalAmount (double LoanAmount , double interestRate) {
		 return LoanAmount + interestRate;
	 }
	 double calculateMonthlyEMI(double totalamount , int Loantenure ) {
		 return totalamount/(Loantenure * 12);
	 }
	 void displayLoanSummary(double interestRate , double totalamount , double EMI  ) {
		 System.out.println(interestRate);
		 System.out.println(totalamount); 
		 System.out.println(EMI); 
		 System.out.println("customerName;"+customerName);
	 }
	 

	public static void main(String[] args) {
		LoanManagement m = new LoanManagement();
		
		
		

	}

}
