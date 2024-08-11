package com.cicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/msg")
	public String getMassage() {
		return "Hii This is ci cd demo application";
	}
}
