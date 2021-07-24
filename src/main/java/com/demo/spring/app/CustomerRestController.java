package com.demo.spring.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

	@RequestMapping(name = "hello")
	public String hello() {
		return "Hello welcome spring boot rest api.";
	}
}
