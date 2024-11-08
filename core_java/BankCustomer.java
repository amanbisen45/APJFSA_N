package core_java;

public class BankCustomer {
	// Fields
	private int acno;
	private String atype;
	private double amt;

	// Default Constructor
	public BankCustomer() {
		this.acno = 0;
		this.atype = "Unknown";
		this.amt = 0.0;
	}

	// Constructor with account number and account type
	public BankCustomer(int acno, String atype) {
		this.acno = acno;
		this.atype = atype;
		this.amt = 0.0; // Default amount set to 0.0
	}

	// Constructor with all fields
	public BankCustomer(int acno, String atype, double amt) {
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
		// Creating objects using different constructors
		BankCustomer obj1 = new BankCustomer();
		BankCustomer obj2 = new BankCustomer(123456, "Checking");
		BankCustomer obj3 = new BankCustomer(654321, "Savings", 50000.55);

		// Displaying the details of each customer
		System.out.println("Customer 1 Details:");
		obj1.displayCustomerDetails();

		System.out.println("Customer 2 Details:");
		obj2.displayCustomerDetails();

		System.out.println("Customer 3 Details:");
		obj3.displayCustomerDetails();
	}
}

/* Customer 1 Details:
Account Number: 0
Account Type: Unknown
Amount: 0.0
Customer 2 Details:
Account Number: 123456
Account Type: Checking
Amount: 0.0
Customer 3 Details:
Account Number: 654321
Account Type: Savings
Amount: 50000.55
*/
