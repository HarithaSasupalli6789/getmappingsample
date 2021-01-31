package com.getit.getmappingsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/print")
	public String name()
	{
		return "helloworld";
	}
}
