package com.his.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerTestController {

	@GetMapping("/welcome")
	public String getMsg() {
		return "Welcome";
	}
}
