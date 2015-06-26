package com.homework4;

public class Main {

	public static void main(String[] args) {
		Main obj = new Main();
		obj.main();

	}
	
	public void main() {
		Employee employee = new Employee("John Smith", 80000, 2003, 12, 23);
		Account[] acc = {new Account(300, "checking", employee),
					new Account(300, "saving", employee),
					new Account(300, "retirement", employee)};
		for(int i=0; i<acc.length; i++)
			System.out.println(acc[i].toString());
	}

}
