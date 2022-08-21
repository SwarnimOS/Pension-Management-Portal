package com.project.cts.pensionerdetailservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="authentication-service")
public interface AuthenticationProxy {
	
	@GetMapping("/validate")
	public ResponseEntity<?> validateToken(@RequestHeader(name = "Authorization") String token);

}
