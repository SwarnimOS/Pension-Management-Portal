package com.project.cts.pensionerdetailservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.project.cts.pensionerdetailservice.Exception.InvalidTokenException;
import com.project.cts.pensionerdetailservice.Service.PensionerDetailService;
import com.project.cts.pensionerdetailservice.feign.AuthenticationProxy;
import com.project.cts.pensionerdetailservice.model.PensionerDetail;

@RestController
public class PensionerDetailController {

	@Autowired
	private PensionerDetailService pensionerDetailService;

	@Autowired
	private AuthenticationProxy authenticationProxy;

	@GetMapping("PensionerDetailsByAadhar/{aadharNo}")
	public PensionerDetail pensionerDetail(@RequestHeader(name = "Authorization") String token,
			@PathVariable String aadharNo) {
		try {
			authenticationProxy.validateToken(token);
		} catch (Exception ex) {
			throw new InvalidTokenException("You are not allowed to access this resource!");
		}

		return pensionerDetailService.getPensionerDetailByAadharNumber(aadharNo);

	}

}
