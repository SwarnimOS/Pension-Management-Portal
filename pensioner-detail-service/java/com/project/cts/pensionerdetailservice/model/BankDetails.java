package com.project.cts.pensionerdetailservice.model;

public class BankDetails {
	
	private String bankName;
	private long accountNumber;
	private String bankType;
	
	protected BankDetails() {
		
	}

	public BankDetails(String bankName, long accountNumber, String bankType) {
		super();
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.bankType = bankType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	@Override
	public String toString() {
		return "BankDetails [bankName=" + bankName + ", accountNumber=" + accountNumber + ", bankType=" + bankType
				+ "]";
	}

	
}
