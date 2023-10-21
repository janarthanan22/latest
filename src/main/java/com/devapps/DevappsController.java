package com.devapps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevappsController {
	@GetMapping("/get")
	public String getname() {
		return "Hello world";
	}

}
