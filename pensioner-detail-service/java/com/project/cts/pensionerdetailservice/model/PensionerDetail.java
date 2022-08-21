package com.project.cts.pensionerdetailservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PensionerDetail {

	@JsonIgnore
	private String aadharNo;
	@JsonIgnore
	private String name;
	@JsonIgnore
	private String dateOfBirth;
	@JsonIgnore
	private String pan;
	private double salaryEarned;
	private double allowances;
	private String pensionType;
	@JsonIgnore
	private String bankName;
	@JsonIgnore
	private long accountNumber;
	private String bankType;

	// private BankDetails bank;
//
	protected PensionerDetail() {

	}

	public PensionerDetail(double salaryEarned, double allowances, String pensionType) {
		this.salaryEarned = salaryEarned;
		this.allowances = allowances;
		this.pensionType = pensionType;

	}

	public PensionerDetail(String aadharNo, String name, String dateOfBirth, String pan, double salaryEarned,
			double allowances, String pensionType, String bankName, long accountNumber, String bankType) {
		super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.pan = pan;
		this.salaryEarned = salaryEarned;
		this.allowances = allowances;
		this.pensionType = pensionType;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.bankType = bankType;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public double getSalaryEarned() {
		return salaryEarned;
	}

	public void setSalaryEarned(double salaryEarned) {
		this.salaryEarned = salaryEarned;
	}

	public double getAllowances() {
		return allowances;
	}

	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}

	public String getPensionType() {
		return pensionType;
	}

	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
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
		return "PensionerDetail [aadharNo=" + aadharNo + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", pan="
				+ pan + ", salaryEarned=" + salaryEarned + ", allowances=" + allowances + ", pensionType=" + pensionType
				+ ", bankName=" + bankName + ", accountNumber=" + accountNumber + ", bankType=" + bankType + "]";
	}

}
