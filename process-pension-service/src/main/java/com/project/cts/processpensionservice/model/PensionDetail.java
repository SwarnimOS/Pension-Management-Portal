package com.project.cts.processpensionservice.model;



public class PensionDetail {
	
	

	private double pensionAmount;
	private int bankServiceCharge;
	
	protected PensionDetail() {
		
	}
	
	public PensionDetail(double pensionAmount, int bankServiceCharge) {
		super();
		this.pensionAmount = pensionAmount;
		this.bankServiceCharge = bankServiceCharge;
	}


	public double getPensionAmount() {
		return pensionAmount;
	}


	public void setPensionAmount(double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}


	public int getBankServiceCharge() {
		return bankServiceCharge;
	}


	public void setBankServiceCharge(int bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}


	@Override
	public String toString() {
		return "PensionDetail [ pensionAmount=" + pensionAmount
				+ ", bankServiceCharge=" + bankServiceCharge + "]";
	}
	
	
	
	

}
