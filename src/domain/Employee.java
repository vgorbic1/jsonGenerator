package domain;

public class Employee {

	private String firstName;
	private String lastName;
	private String email;
	private Integer employeeId;
	
	public Employee(String firstName, String lastName, String email, int employeeId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

}
