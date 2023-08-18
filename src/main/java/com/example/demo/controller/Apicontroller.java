package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller {
	@Value("${n}")
private String name;
	@GetMapping("getName")
	public String myName()
	{
		return name;
	}
}
