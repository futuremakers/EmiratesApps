package com.emiratesApp.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/api/home")
	public String home() {
		return "Emirates Application Management Demo";
	}
}
