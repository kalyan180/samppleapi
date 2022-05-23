package com.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@SecurityRequirement(name = "jwtapi")
public class HelloWorldController {

	@RequestMapping({ "api/hello" })
	public String firstPage() {
		return "Hello World";
	}


}