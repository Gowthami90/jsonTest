package com.vijaytech;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializeDemo {

	public static void main(String[] args) throws JsonProcessingException {

		Customer customer=new Customer();
		
		customer.setFirstName("vijay");
		customer.setLastName("bhaskar");
		customer.setMobNum("9703547640");
		customer.setCity("Hyderabad");
		customer.setAddress("Lingampally");
		customer.setEmailId("gow@gmail.com");
		
		List<Order> ordersList=new ArrayList<Order>();
		
		Order order= new Order();
		
		order.setOid("123");
		order.setName("mobile");
		order.setQuantity(3);
		
		Order order1= new Order();
		
		order.setOid("1234");
		order.setName("TV");
		order.setQuantity(1);
		
		ordersList.add(order);
		ordersList.add(order1);
		
		Account account = new Account();
		account.setAccountNumber(12345678);
		account.setBranchName("Banjara Hills");
		account.setBalance(10000.00f);
		
		customer.setAccount(account);
		customer.setOrders(ordersList);
		
		
		ObjectMapper mapper=new ObjectMapper();
		//String json=mapper.writeValueAsString(customer);
		
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customer);

		
		System.out.println("json data is : " + json);

	}

}
