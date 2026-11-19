package com.tcs.emp;

public class Driver {

	Address address;
	Employee emp1;
	Employee clonedEmp;

	public void doSomething() throws CloneNotSupportedException {

    		address = new Address("16th Main", "27th Cross", "Bangalore");
    
		emp1 = new Employee("Kodewala", "kw123", address);

		clonedEmp = (Employee) emp1.clone();

		emp1.address.city = "Hyd";

		System.out.println(emp1.address.city);
		System.out.println(clonedEmp.address.city);
		
		
		// 500 more lines...

	}

	public static void main(String[] args) throws CloneNotSupportedException {

	}

}
