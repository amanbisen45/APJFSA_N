package core_java;

public class BankCustomer1 {
	// Fields
	private int acno;
	private String atype;
	private double amt;

	// Parameterized Constructor
	public BankCustomer1(int acno, String atype, double amt) {
		this.acno = acno;
		this.atype = atype;
		this.amt = amt;
	}

	// Method to display customer details
	public void displayCustomerDetails() {
		System.out.println("Account Number: " + acno);
		System.out.println("Account Type: " + atype);
		System.out.println("Amount: " + amt);
	}

	public static void main(String[] args) {
		// Creating an object of BankCustomer using the parameterized constructor
		BankCustomer1 obj = new BankCustomer1(123456789, "Savings", 100000);

		// Displaying the customer details
		obj.displayCustomerDetails();
	}
}

/*
 * Account Number: 123456789
Account Type: Savings
Amount: 100000.0
 */
