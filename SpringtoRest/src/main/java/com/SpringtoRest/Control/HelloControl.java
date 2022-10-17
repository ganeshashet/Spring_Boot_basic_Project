package com.SpringtoRest.Control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {
	@RequestMapping("/hello")
	public String SayHai()
	{
		return "hello User";
	}

}