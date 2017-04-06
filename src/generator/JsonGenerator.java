package generator;

import java.io.IOException;

public class JsonGenerator {

	public static void main(String[] args) {
		
		//AddressGenerator ag = new AddressGenerator();
		//ag.generateJson();

		EmployeeGenerator eg = new EmployeeGenerator();
		eg.generateJson();
	}

}
