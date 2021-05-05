package com.vijaytech;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

//@JsonIgnoreType

public class Account {

	private String branchName;
	private int accountNumber;
	private float balance;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	

}
