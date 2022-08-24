package com.project.cts.authenticationserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.project.cts.authenticationserver.exception.InvalidCredentialsException;
import com.project.cts.authenticationserver.model.AuthRequest;
import com.project.cts.authenticationserver.model.AuthResponse;
import com.project.cts.authenticationserver.util.JwtUtil;

@RestController
public class LoginController {

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("/authenticate")
	public AuthResponse generateToken(@RequestBody AuthRequest authrequest) throws Exception {

		if (authrequest.getUsername().isEmpty() || authrequest.getPassword().isEmpty()) {
			throw new InvalidCredentialsException("Either Username or Password is empty");
		}
		if (authrequest.getUsername().length() < 3 || authrequest.getUsername().length() > 20) {
			throw new InvalidCredentialsException("Length of username should be between 3 to 20 charaters");
		}
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authrequest.getUsername(), authrequest.getPassword()));
		} catch (BadCredentialsException ex) {
			throw new BadCredentialsException("Invalid username or password!");
		}

		return new AuthResponse(jwtUtil.generateToken(authrequest.getUsername()));

	}

	@GetMapping("/validate")
	public ResponseEntity<?> validateToken(@RequestHeader(name = "Authorization") String token) {
		System.out.println("Auth tokn value in validate auth service " + token);

		jwtUtil.isTokenExpiredOrInvalidFormat(token);

		return new ResponseEntity<Boolean>(true, HttpStatus.OK);

	}



}
