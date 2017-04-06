package generator;

import java.util.*;
import javax.json.Json;
import javax.json.stream.*;

public class AddressGenerator {
	
	public void generateJson() {
		Map<String, Object> properties = new HashMap<>();
		//properties.put(JsonGenerator.PRETTY_PRINTING, true);
		JsonGeneratorFactory factory = Json.createGeneratorFactory(properties);
		javax.json.stream.JsonGenerator jg = factory.createGenerator(System.out);

        jg.writeStartObject()                    // {
        	.write("name", "Jane Doe")           //    "name":"Jane Doe",
        	.writeStartObject("address")         //    "address":{
            	.write("type", 1)                //        "type":1,
            	.write("street", "1 A Street")   //        "street":"1 A Street",
            	.writeNull("city")               //        "city":null,
            	.write("verified", false)        //        "verified":false
            .writeEnd()                          //    },
            .writeStartArray("phone-numbers")    //    "phone-numbers":[
            	.writeStartObject()              //        {
                	.write("number", "555-1111") //            "number":"555-1111",
                	.write("extension", "123")   //            "extension":"123"
                .writeEnd()                      //        },
                .writeStartObject()              //        {
                	.write("number", "555-2222") //            "number":"555-2222",
                	.writeNull("extension")      //            "extension":null
                .writeEnd()                      //        }
            .writeEnd()                          //    ]
        .writeEnd()                              // }
        .close();
	}
}
