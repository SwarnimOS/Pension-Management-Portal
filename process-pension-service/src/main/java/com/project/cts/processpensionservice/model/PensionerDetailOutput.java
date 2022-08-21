package com.project.cts.processpensionservice.model;

public class PensionerDetailOutput {

	private double salaryEarned;
	private double allowances;
	private String pensionType;
	private String bankType;
	
	public PensionerDetailOutput() {
		
	}
	
	public PensionerDetailOutput(double salaryEarned, double allowances, String pensionType, String bankType) {
		super();
		this.salaryEarned = salaryEarned;
		this.allowances = allowances;
		this.pensionType = pensionType;
		this.bankType = bankType;
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
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
	
	
	
}
