package com.homework4;

public class Account {
	//Static variable
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "saving";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	private Employee employee;
	
	//Constructor
	public Account(String acctType, Employee employee) {
		this(DEFAULT_BALANCE, acctType, employee);//constructor calls other constructor
	}

	public Account(double balance, String acctType, Employee employee) {
		this.balance = balance;
		this.acctType = acctType;
		this.employee = employee;
	}
	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
 	}
	
	public void makeDeposit(double deposit) {
		balance += deposit;
		System.out.println("Your current balance is : " + balance);
	}
	
	public boolean makeWithdrawal(double amount) {
		if(amount > balance) {
			System.out.println("Balance is not enough.");
			return false;
		} 
		else {
			balance =- amount;
			return true;
		}
	}
	
	public double computeInterest() {
		if(acctType.equalsIgnoreCase(CHECKING))
			return balance*0.02;
		else 
			if(acctType.equalsIgnoreCase(SAVINGS))
				return balance*0.04;
			else // RETIREMENT
				return balance*0.05;
	}
}
