package com.project.cts.pensionerdetailservice.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.cts.pensionerdetailservice.Exception.AadharNotFoundException;

import com.project.cts.pensionerdetailservice.model.PensionerDetail;

@Service
public class PensionerDetailService {

	public PensionerDetail getPensionerDetailByAadharNumber(String aadharNo) {

		String line = null;
		BufferedReader br = new BufferedReader(
				new InputStreamReader(this.getClass().getResourceAsStream("/details.csv")));

		List<PensionerDetail> pensionerDetails = new ArrayList<>();

		try {
			while ((line = br.readLine()) != null) {

				String[] data = line.split(",");

				PensionerDetail p = new PensionerDetail(data[0], data[1], data[2], data[3], Double.parseDouble(data[4]),
						Double.parseDouble(data[5]), data[6], data[7], Long.parseLong(data[8]), data[9]);

				pensionerDetails.add(p);

			}

			for (PensionerDetail pd : pensionerDetails) {
				if (pd.getAadharNo().equalsIgnoreCase(aadharNo)) {

					// String bankType=pd.getBank().getBankType();
					return pd;
				}

			}

		} catch (NumberFormatException | IOException e) {
			throw new AadharNotFoundException("Aadhar Card Not Found : AadharNumber - " + aadharNo);
		}
		throw new AadharNotFoundException("Aadhar Card Not Found : AadharNumber - " + aadharNo);

		/*
		 * while ((line = br.readLine()) != null) {
		 * 
		 * String[] person = line.split(",");
		 * 
		 * 
		 * if (aadharNo.equals(person[0])) {
		 * 
		 * 
		 * return new PensionerDetail(person[0],person[1],person[2],person[3],
		 * Double.parseDouble(person[4]),Double.parseDouble(person[5]),person[6], new
		 * BankDetails(person[7],Long.parseLong(person[8]),person[9])); } } return null;
		 */

	}
}
