package com.project.cts.processpensionservice.service;

import org.springframework.stereotype.Service;

import com.project.cts.processpensionservice.model.PensionDetail;
import com.project.cts.processpensionservice.model.PensionerDetailOutput;

@Service
public class ProcessPensionService {

	public PensionDetail getPensionAmount(PensionerDetailOutput pensionerDetailOutput) {
		double expectedAmount = 0;

		if (pensionerDetailOutput.getPensionType().equalsIgnoreCase("Self")) {
			expectedAmount = (0.80 * pensionerDetailOutput.getSalaryEarned()) + pensionerDetailOutput.getAllowances();
		} else if (pensionerDetailOutput.getPensionType().equalsIgnoreCase("Family")) {
			expectedAmount = (0.50 * pensionerDetailOutput.getSalaryEarned()) + pensionerDetailOutput.getAllowances();
		}
		
		if(pensionerDetailOutput.getBankType().equalsIgnoreCase("Public")) {
			return new PensionDetail(expectedAmount,500);
		}else if(pensionerDetailOutput.getBankType().equalsIgnoreCase("Private")) {
			return new PensionDetail(expectedAmount,550);
		}
		
		

		return null;
	}

}
