package com.a;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App {  
	@RequestMapping(value="/")
	public String m1() {
		return "hello";
	}

}
