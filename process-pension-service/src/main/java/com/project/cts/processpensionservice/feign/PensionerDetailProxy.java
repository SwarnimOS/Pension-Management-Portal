package com.project.cts.processpensionservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.project.cts.processpensionservice.model.PensionerDetailOutput;

//@FeignClient(name="pensioner-detail",url="localhost:8081")
@FeignClient(name="pensioner-detail")
public interface PensionerDetailProxy {
	
	@GetMapping("PensionerDetailsByAadhar/{aadharNo}")
	public PensionerDetailOutput pensionerDetail(@RequestHeader(name = "Authorization") String token,
			@PathVariable String aadharNo);
	
}
