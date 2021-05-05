package com.vijaytech;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDeserializeDemo {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper=new ObjectMapper();
	Customer customer =	mapper.readValue(new File("C:\\Users\\lenovo\\eclipse-workspace\\JsonTest\\src\\main\\resources\\customer.json"),Customer.class);
	
	
	System.out.println("Customer data is " + customer);
	}

}
 