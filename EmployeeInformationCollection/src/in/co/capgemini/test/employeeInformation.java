package in.co.capgemini.test;

public class employeeInformation {
	// instance members
	private int empID;
	private String employee_Name;
	private String employee_designation;
	private float employee_Salary;
	private String employee_comm;

	public employeeInformation(int empID, String employee_Name, String employee_designation, float employee_Salary,
			String employee_comm) {
		super();
		this.empID = empID;
		this.employee_Name = employee_Name;
		this.employee_designation = employee_designation;
		this.employee_Salary = employee_Salary;
		this.employee_comm = employee_comm;
	}

	// getters for all the instance members
	public int getEmpID() {
		return empID;
	}

	public String getEmployee_Name() {
		return employee_Name;
	}

	public String getEmployee_designation() {
		return employee_designation;
	}

	public float getEmployee_Salary() {
		return employee_Salary;
	}

	public String getEmployee_comm() {
		return employee_comm;
	}

	@Override
	public String toString() {
		return "employeeInformation [empID=" + empID + ", employee_Name=" + employee_Name + ", employee_designation="
				+ employee_designation + ", employee_Salary=" + employee_Salary + ", employee_comm=" + employee_comm
				+ "]";
	}

}
