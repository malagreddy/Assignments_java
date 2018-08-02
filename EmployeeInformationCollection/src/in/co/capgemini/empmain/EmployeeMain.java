package in.co.capgemini.empmain;

import java.util.HashMap;

import in.co.capgemini.test.MMASavingAccount;
import in.co.capgemini.test.employeeInformation;

public class EmployeeMain {
	public static void main(String[] args) {
		HashMap<employeeInformation, MMASavingAccount> hashmap = new HashMap<employeeInformation, MMASavingAccount>();

		MMASavingAccount mma1 = new MMASavingAccount(200, "Mala", 2000, false);
		MMASavingAccount mma2 = new MMASavingAccount(201, "preeth", 9000, true);

		employeeInformation emp1 = new employeeInformation(155362, "Mala", "Developer", 15000, "7353226409");
		employeeInformation emp2 = new employeeInformation(155361, "preeth", "Tester", 12000, "8861892409");

		// relating account details with the employee information
		hashmap.put(emp1, mma1);
		hashmap.put(emp2, mma2);

		// Print the account details of respective employee
		System.out.println("Employee 1 details are :" + hashmap.get(emp1));
		System.out.println("Employee 2 details are :" + hashmap.get(emp2));
	}

}
