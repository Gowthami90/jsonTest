package com.vijaytech;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties({ "address", "emailId" })
public class Customer {
	//@JsonProperty("first_name")
	private String firstName;
	// @JsonProperty("last_name")
	private String lastName;
	private String address;
	private String emailId;
	private String mobNum;
	// @JsonIgnore
	private String city;
	private List<Order> orders;
	private Account account;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobNum() {
		return mobNum;
	}

	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", emailId="
				+ emailId + ", mobNum=" + mobNum + ", city=" + city + ", orders=" + orders + ", account=" + account
				+ "]";
	}
	

}
