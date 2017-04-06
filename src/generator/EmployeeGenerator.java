package generator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.json.*;
import javax.json.stream.JsonGenerator;

import domain.Employee;

public class EmployeeGenerator {

	public void generateJson() {

		List<Employee> employees = createEmployeeList();

		// Create file output stream for writing data to a File
		OutputStream outputStream;
		try {
			outputStream = new FileOutputStream("output/employee.json");

			JsonGenerator jg = Json.createGenerator(outputStream);
			jg.writeStartArray();
			for (Employee employee : employees) {
				// Writes the JSON object for each Employee object
				jg.writeStartObject().write("employeeId", employee.getEmployeeId())
						.write("firstName", employee.getFirstName()).write("lastName", employee.getLastName())
						.write("email", employee.getEmail()).writeEnd();
			}
			// Writes the end of the current context(array).
			jg.writeEnd();
			jg.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("The JSON output is ready ...");

	}

	private List<Employee> createEmployeeList() {
		// Populate Employee list
		Employee e1 = new Employee("John", "Doe", "jdoe@xxx.com", 100);
		Employee e2 = new Employee("Jane", "Doe", "jane@xxx.com", 101);
		Employee e3 = new Employee("James", "Doe", "james@xxx.com", 102);

		// Create Employee list
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);

		return employees;
	}

}
