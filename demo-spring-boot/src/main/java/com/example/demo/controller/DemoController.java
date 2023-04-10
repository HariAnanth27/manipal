package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class DemoController {
	@GetMapping("/welcome/{hari}")
	public String meth1(@PathVariable String name)
	{
		return "<h1>Hai"+name+"welcome to SpringBoot<h1>";
	}

}
