package lab;

public class Bank {
	private double amount;
	

	public Bank(double amount) {
		super();
		this.amount = amount;
	}
	
	public void withdrawl(double withdrawlAmount) {
		String result=(withdrawlAmount<=amount)?"successful withdrawl":"Insufficient Balance";
		
		amount=(withdrawlAmount<=amount)?(amount-withdrawlAmount):amount;
		System.out.println(result);
	}

	public void deposit(double depositAmount) {
		amount+=depositAmount;
		System.out.println("Deposited Successfuly. Deposited: "+depositAmount);
	}
	
	
	public void displayBalance() {
		System.out.println("Total amount: "+amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank amount=new Bank(10000);
		amount.displayBalance();
		amount.withdrawl(1000);
		amount.displayBalance();
		amount.deposit(1000);
		amount.displayBalance();
	}

}
