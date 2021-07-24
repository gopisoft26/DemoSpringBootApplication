package com.demo.spring.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello welcome spring boot rest api.";
	}
}
