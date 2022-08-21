package com.project.cts.processpensionservice.model;

public class ProcessPensionInput {

	private String aadharNo;

	protected ProcessPensionInput() {
		
	}
	
	public ProcessPensionInput(String aadharNo) {
		super();
		this.aadharNo = aadharNo;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	@Override
	public String toString() {
		return "ProcessPensionInput [aadharNo=" + aadharNo + "]";
	}
	
	
	
}
