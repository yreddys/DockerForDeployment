package com.yarraneella.hotel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("/get")
	String sayHi(@RequestParam String str) {
		return "Hello" + str;
	}
}
